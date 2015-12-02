.class Lcom/qihoo/security/gamebooster/b$4;
.super Lcom/qihoo/security/service/c$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/gamebooster/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/gamebooster/b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/gamebooster/b;)V
    .locals 0

    .prologue
    .line 1057
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/b$4;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-direct {p0}, Lcom/qihoo/security/service/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZZZLjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 1062
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$4;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/qihoo/security/gamebooster/b;->a(ZZZLjava/lang/String;)V

    .line 1064
    return-void
.end method
