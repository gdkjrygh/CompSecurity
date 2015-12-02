.class Lcom/qihoo/security/floatview/ui/f$4;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/floatview/ui/f;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/floatview/ui/f;


# direct methods
.method constructor <init>(Lcom/qihoo/security/floatview/ui/f;)V
    .locals 0

    .prologue
    .line 399
    iput-object p1, p0, Lcom/qihoo/security/floatview/ui/f$4;->a:Lcom/qihoo/security/floatview/ui/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 402
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f$4;->a:Lcom/qihoo/security/floatview/ui/f;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/qihoo/security/floatview/ui/f;->b(Lcom/qihoo/security/floatview/ui/f;Z)V

    .line 403
    return-void
.end method
