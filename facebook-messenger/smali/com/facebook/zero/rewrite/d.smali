.class final Lcom/facebook/zero/rewrite/d;
.super Ljava/lang/Object;
.source "ZeroUrlRewriteRule.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;
    .locals 2

    .prologue
    .line 136
    new-instance v0, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;-><init>(Landroid/os/Parcel;Lcom/facebook/zero/rewrite/d;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;
    .locals 1

    .prologue
    .line 141
    new-array v0, p1, [Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 133
    invoke-virtual {p0, p1}, Lcom/facebook/zero/rewrite/d;->a(Landroid/os/Parcel;)Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 133
    invoke-virtual {p0, p1}, Lcom/facebook/zero/rewrite/d;->a(I)[Lcom/facebook/zero/rewrite/ZeroUrlRewriteRule;

    move-result-object v0

    return-object v0
.end method
