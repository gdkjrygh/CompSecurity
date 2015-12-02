.class Lcom/qihoo/security/profile/j$1;
.super Lcom/qihoo/security/profile/d$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/profile/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/profile/j;


# direct methods
.method constructor <init>(Lcom/qihoo/security/profile/j;)V
    .locals 0

    .prologue
    .line 53
    iput-object p1, p0, Lcom/qihoo/security/profile/j$1;->a:Lcom/qihoo/security/profile/j;

    invoke-direct {p0}, Lcom/qihoo/security/profile/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 56
    iget-object v0, p0, Lcom/qihoo/security/profile/j$1;->a:Lcom/qihoo/security/profile/j;

    invoke-static {v0}, Lcom/qihoo/security/profile/j;->a(Lcom/qihoo/security/profile/j;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
