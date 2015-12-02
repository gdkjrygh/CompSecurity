.class public Lcom/facebook/user/MobileAppData;
.super Ljava/lang/Object;
.source "MobileAppData.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/user/MobileAppData;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/Long;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/Long;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 63
    new-instance v0, Lcom/facebook/user/g;

    invoke-direct {v0}, Lcom/facebook/user/g;-><init>()V

    sput-object v0, Lcom/facebook/user/MobileAppData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-static {v0}, Lcom/google/common/a/ev;->a(Ljava/util/Map;)Lcom/google/common/a/ev;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/MobileAppData;->a:Lcom/google/common/a/ev;

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-static {v0}, Lcom/google/common/a/ev;->a(Ljava/util/Map;)Lcom/google/common/a/ev;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/MobileAppData;->b:Lcom/google/common/a/ev;

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-static {v0}, Lcom/google/common/a/ev;->a(Ljava/util/Map;)Lcom/google/common/a/ev;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/MobileAppData;->c:Lcom/google/common/a/ev;

    .line 40
    return-void
.end method

.method public constructor <init>(Lcom/google/common/a/ev;Lcom/google/common/a/ev;Lcom/google/common/a/ev;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/Long;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/Long;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/facebook/user/MobileAppData;->a:Lcom/google/common/a/ev;

    .line 31
    iput-object p2, p0, Lcom/facebook/user/MobileAppData;->b:Lcom/google/common/a/ev;

    .line 32
    iput-object p3, p0, Lcom/facebook/user/MobileAppData;->c:Lcom/google/common/a/ev;

    .line 33
    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/ev;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/Long;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .prologue
    .line 115
    iget-object v0, p0, Lcom/facebook/user/MobileAppData;->a:Lcom/google/common/a/ev;

    return-object v0
.end method

.method public a(Ljava/lang/Long;)Ljava/lang/Boolean;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/user/MobileAppData;->b:Lcom/google/common/a/ev;

    invoke-virtual {v0, p1}, Lcom/google/common/a/ev;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 51
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 53
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/user/MobileAppData;->b:Lcom/google/common/a/ev;

    invoke-virtual {v0, p1}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    goto :goto_0
.end method

.method public b()Lcom/google/common/a/ev;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/Long;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .prologue
    .line 119
    iget-object v0, p0, Lcom/facebook/user/MobileAppData;->b:Lcom/google/common/a/ev;

    return-object v0
.end method

.method public c()Lcom/google/common/a/ev;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .prologue
    .line 123
    iget-object v0, p0, Lcom/facebook/user/MobileAppData;->c:Lcom/google/common/a/ev;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 104
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 78
    if-ne p0, p1, :cond_1

    .line 99
    :cond_0
    :goto_0
    return v0

    .line 81
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    .line 82
    goto :goto_0

    .line 85
    :cond_3
    check-cast p1, Lcom/facebook/user/MobileAppData;

    .line 87
    iget-object v2, p0, Lcom/facebook/user/MobileAppData;->a:Lcom/google/common/a/ev;

    iget-object v3, p1, Lcom/facebook/user/MobileAppData;->a:Lcom/google/common/a/ev;

    invoke-virtual {v2, v3}, Lcom/google/common/a/ev;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    move v0, v1

    .line 88
    goto :goto_0

    .line 91
    :cond_4
    iget-object v2, p0, Lcom/facebook/user/MobileAppData;->b:Lcom/google/common/a/ev;

    iget-object v3, p1, Lcom/facebook/user/MobileAppData;->b:Lcom/google/common/a/ev;

    invoke-virtual {v2, v3}, Lcom/google/common/a/ev;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    move v0, v1

    .line 92
    goto :goto_0

    .line 95
    :cond_5
    iget-object v2, p0, Lcom/facebook/user/MobileAppData;->c:Lcom/google/common/a/ev;

    iget-object v3, p1, Lcom/facebook/user/MobileAppData;->c:Lcom/google/common/a/ev;

    invoke-virtual {v2, v3}, Lcom/google/common/a/ev;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    .line 96
    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Lcom/facebook/user/MobileAppData;->a:Lcom/google/common/a/ev;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 110
    iget-object v0, p0, Lcom/facebook/user/MobileAppData;->b:Lcom/google/common/a/ev;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 111
    iget-object v0, p0, Lcom/facebook/user/MobileAppData;->c:Lcom/google/common/a/ev;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 112
    return-void
.end method
