.class public Lcom/facebook/orca/contacts/divebar/av;
.super Ljava/lang/Object;
.source "DivebarNearbyFriendsParams.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field public final a:Lcom/facebook/orca/contacts/divebar/aw;

.field public final b:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field public final c:I


# direct methods
.method private constructor <init>(Lcom/facebook/orca/contacts/divebar/aw;Lcom/google/common/a/es;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/contacts/divebar/aw;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;I)V"
        }
    .end annotation

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/av;->a:Lcom/facebook/orca/contacts/divebar/aw;

    .line 31
    iput-object p2, p0, Lcom/facebook/orca/contacts/divebar/av;->b:Lcom/google/common/a/es;

    .line 32
    iput p3, p0, Lcom/facebook/orca/contacts/divebar/av;->c:I

    .line 33
    return-void
.end method

.method public static a(Lcom/google/common/a/es;)Lcom/facebook/orca/contacts/divebar/av;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;)",
            "Lcom/facebook/orca/contacts/divebar/av;"
        }
    .end annotation

    .prologue
    .line 48
    new-instance v0, Lcom/facebook/orca/contacts/divebar/av;

    sget-object v1, Lcom/facebook/orca/contacts/divebar/aw;->LIST:Lcom/facebook/orca/contacts/divebar/aw;

    invoke-virtual {p0}, Lcom/google/common/a/es;->size()I

    move-result v2

    invoke-direct {v0, v1, p0, v2}, Lcom/facebook/orca/contacts/divebar/av;-><init>(Lcom/facebook/orca/contacts/divebar/aw;Lcom/google/common/a/es;I)V

    return-object v0
.end method
