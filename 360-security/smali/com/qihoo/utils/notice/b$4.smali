.class Lcom/qihoo/utils/notice/b$4;
.super Lcom/qihoo/security/service/b$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/utils/notice/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/utils/notice/b;


# direct methods
.method constructor <init>(Lcom/qihoo/utils/notice/b;)V
    .locals 0

    .prologue
    .line 247
    iput-object p1, p0, Lcom/qihoo/utils/notice/b$4;->a:Lcom/qihoo/utils/notice/b;

    invoke-direct {p0}, Lcom/qihoo/security/service/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 253
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$4;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v0, p1}, Lcom/qihoo/utils/notice/b;->b(Lcom/qihoo/utils/notice/b;I)I

    .line 254
    return-void
.end method
