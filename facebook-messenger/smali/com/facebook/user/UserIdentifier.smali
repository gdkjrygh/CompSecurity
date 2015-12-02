.class public abstract Lcom/facebook/user/UserIdentifier;
.super Ljava/lang/Object;
.source "UserIdentifier.java"

# interfaces
.implements Landroid/os/Parcelable;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    return-void
.end method


# virtual methods
.method public abstract a(Landroid/content/res/Resources;)Ljava/lang/String;
.end method

.method public abstract c()Lcom/facebook/user/UserIdentifierKey;
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Lcom/facebook/user/s;
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 52
    invoke-virtual {p0}, Lcom/facebook/user/UserIdentifier;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
