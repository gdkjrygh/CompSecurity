.class Lcom/qihoo/security/floatview/ui/c$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/floatview/ui/c;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Lcom/qihoo/security/floatview/ui/c;


# direct methods
.method constructor <init>(Lcom/qihoo/security/floatview/ui/c;III)V
    .locals 0

    .prologue
    .line 460
    iput-object p1, p0, Lcom/qihoo/security/floatview/ui/c$2;->d:Lcom/qihoo/security/floatview/ui/c;

    iput p2, p0, Lcom/qihoo/security/floatview/ui/c$2;->a:I

    iput p3, p0, Lcom/qihoo/security/floatview/ui/c$2;->b:I

    iput p4, p0, Lcom/qihoo/security/floatview/ui/c$2;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 464
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$2;->d:Lcom/qihoo/security/floatview/ui/c;

    iget v1, p0, Lcom/qihoo/security/floatview/ui/c$2;->a:I

    iget v2, p0, Lcom/qihoo/security/floatview/ui/c$2;->b:I

    iget v3, p0, Lcom/qihoo/security/floatview/ui/c$2;->c:I

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo/security/floatview/ui/c;->a(Lcom/qihoo/security/floatview/ui/c;III)V

    .line 465
    return-void
.end method
