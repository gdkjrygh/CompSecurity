.class final Lcom/qihoo/security/ui/main/a$2;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/main/a;->a(J[Landroid/view/View;[Landroid/view/View;Lcom/nineoldandroids/a/b;)J
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/nineoldandroids/a/b;

.field final synthetic c:Z


# direct methods
.method constructor <init>(Landroid/view/View;Lcom/nineoldandroids/a/b;Z)V
    .locals 0

    .prologue
    .line 419
    iput-object p1, p0, Lcom/qihoo/security/ui/main/a$2;->a:Landroid/view/View;

    iput-object p2, p0, Lcom/qihoo/security/ui/main/a$2;->b:Lcom/nineoldandroids/a/b;

    iput-boolean p3, p0, Lcom/qihoo/security/ui/main/a$2;->c:Z

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 422
    iget-object v0, p0, Lcom/qihoo/security/ui/main/a$2;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 423
    return-void
.end method

.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 1

    .prologue
    .line 427
    iget-object v0, p0, Lcom/qihoo/security/ui/main/a$2;->b:Lcom/nineoldandroids/a/b;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/qihoo/security/ui/main/a$2;->c:Z

    if-eqz v0, :cond_0

    .line 428
    iget-object v0, p0, Lcom/qihoo/security/ui/main/a$2;->b:Lcom/nineoldandroids/a/b;

    invoke-virtual {v0, p1}, Lcom/nineoldandroids/a/b;->b(Lcom/nineoldandroids/a/a;)V

    .line 430
    :cond_0
    return-void
.end method
