.class Lcom/qihoo/security/ui/antivirus/list/b$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/list/b;-><init>(Landroid/content/Context;Landroid/os/Handler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/antivirus/list/b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/list/b;)V
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/list/b$1;->a:Lcom/qihoo/security/ui/antivirus/list/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/b$1;->a:Lcom/qihoo/security/ui/antivirus/list/b;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/list/b;->e()V

    .line 56
    const/4 v0, 0x0

    return v0
.end method
