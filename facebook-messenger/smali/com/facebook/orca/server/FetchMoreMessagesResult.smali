.class public Lcom/facebook/orca/server/FetchMoreMessagesResult;
.super Lcom/facebook/fbservice/c/a;
.source "FetchMoreMessagesResult.java"

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
            "Lcom/facebook/orca/server/FetchMoreMessagesResult;",
            ">;"
        }
    .end annotation
.end field

.field public static final a:Lcom/facebook/orca/server/FetchMoreMessagesResult;


# instance fields
.field private final b:Lcom/facebook/orca/threads/MessagesCollection;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    .line 20
    new-instance v0, Lcom/facebook/orca/server/FetchMoreMessagesResult;

    sget-object v1, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    const/4 v2, 0x0

    const-wide/16 v3, -0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/facebook/orca/server/FetchMoreMessagesResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/MessagesCollection;J)V

    sput-object v0, Lcom/facebook/orca/server/FetchMoreMessagesResult;->a:Lcom/facebook/orca/server/FetchMoreMessagesResult;

    .line 41
    new-instance v0, Lcom/facebook/orca/server/p;

    invoke-direct {v0}, Lcom/facebook/orca/server/p;-><init>()V

    sput-object v0, Lcom/facebook/orca/server/FetchMoreMessagesResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/c/a;-><init>(Landroid/os/Parcel;)V

    .line 34
    const-class v0, Lcom/facebook/orca/threads/MessagesCollection;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/MessagesCollection;

    iput-object v0, p0, Lcom/facebook/orca/server/FetchMoreMessagesResult;->b:Lcom/facebook/orca/threads/MessagesCollection;

    .line 35
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/server/p;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1}, Lcom/facebook/orca/server/FetchMoreMessagesResult;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/MessagesCollection;J)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1, p3, p4}, Lcom/facebook/fbservice/c/a;-><init>(Lcom/facebook/fbservice/c/b;J)V

    .line 29
    iput-object p2, p0, Lcom/facebook/orca/server/FetchMoreMessagesResult;->b:Lcom/facebook/orca/threads/MessagesCollection;

    .line 30
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/threads/MessagesCollection;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/orca/server/FetchMoreMessagesResult;->b:Lcom/facebook/orca/threads/MessagesCollection;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 54
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 59
    invoke-super {p0, p1, p2}, Lcom/facebook/fbservice/c/a;->writeToParcel(Landroid/os/Parcel;I)V

    .line 60
    iget-object v0, p0, Lcom/facebook/orca/server/FetchMoreMessagesResult;->b:Lcom/facebook/orca/threads/MessagesCollection;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 61
    return-void
.end method
