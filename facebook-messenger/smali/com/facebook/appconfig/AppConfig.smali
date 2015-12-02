.class public Lcom/facebook/appconfig/AppConfig;
.super Ljava/lang/Object;
.source "AppConfig.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/appconfig/AppConfig;",
            ">;"
        }
    .end annotation
.end field

.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/common/bundle/ImmutableBundle;

.field private final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    const-class v0, Lcom/facebook/appconfig/AppConfig;

    sput-object v0, Lcom/facebook/appconfig/AppConfig;->a:Ljava/lang/Class;

    .line 68
    new-instance v0, Lcom/facebook/appconfig/a;

    invoke-direct {v0}, Lcom/facebook/appconfig/a;-><init>()V

    sput-object v0, Lcom/facebook/appconfig/AppConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    const-class v0, Lcom/facebook/common/bundle/ImmutableBundle;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/bundle/ImmutableBundle;

    iput-object v0, p0, Lcom/facebook/appconfig/AppConfig;->b:Lcom/facebook/common/bundle/ImmutableBundle;

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/appconfig/AppConfig;->c:J

    .line 39
    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/JsonNode;J)V
    .locals 1

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    invoke-static {p1}, Lcom/facebook/common/bundle/ImmutableBundle;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/common/bundle/ImmutableBundle;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/appconfig/AppConfig;->b:Lcom/facebook/common/bundle/ImmutableBundle;

    .line 33
    iput-wide p2, p0, Lcom/facebook/appconfig/AppConfig;->c:J

    .line 34
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/bundle/ImmutableBundle;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/appconfig/AppConfig;->b:Lcom/facebook/common/bundle/ImmutableBundle;

    return-object v0
.end method

.method public b()J
    .locals 2

    .prologue
    .line 56
    iget-wide v0, p0, Lcom/facebook/appconfig/AppConfig;->c:J

    return-wide v0
.end method

.method public c()Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/appconfig/AppConfig;->b:Lcom/facebook/common/bundle/ImmutableBundle;

    invoke-virtual {v0}, Lcom/facebook/common/bundle/ImmutableBundle;->a()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 83
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 88
    iget-object v0, p0, Lcom/facebook/appconfig/AppConfig;->b:Lcom/facebook/common/bundle/ImmutableBundle;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 89
    iget-wide v0, p0, Lcom/facebook/appconfig/AppConfig;->c:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 90
    return-void
.end method
