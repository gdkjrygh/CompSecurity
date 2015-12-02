.class Lcom/qihoo/security/ui/main/b$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/nineoldandroids/a/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/main/b;->a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;JLandroid/view/View;Lcom/nineoldandroids/a/a$a;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/nineoldandroids/a/a$a;

.field final synthetic c:Lcom/qihoo/security/ui/main/b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/main/b;Landroid/view/View;Lcom/nineoldandroids/a/a$a;)V
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lcom/qihoo/security/ui/main/b$2;->c:Lcom/qihoo/security/ui/main/b;

    iput-object p2, p0, Lcom/qihoo/security/ui/main/b$2;->a:Landroid/view/View;

    iput-object p3, p0, Lcom/qihoo/security/ui/main/b$2;->b:Lcom/nineoldandroids/a/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 95
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b$2;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 96
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b$2;->b:Lcom/nineoldandroids/a/a$a;

    if-eqz v0, :cond_0

    .line 97
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b$2;->b:Lcom/nineoldandroids/a/a$a;

    invoke-interface {v0, p1}, Lcom/nineoldandroids/a/a$a;->a(Lcom/nineoldandroids/a/a;)V

    .line 99
    :cond_0
    return-void
.end method

.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 110
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b$2;->a:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 111
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b$2;->b:Lcom/nineoldandroids/a/a$a;

    if-eqz v0, :cond_0

    .line 112
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b$2;->b:Lcom/nineoldandroids/a/a$a;

    invoke-interface {v0, p1}, Lcom/nineoldandroids/a/a$a;->b(Lcom/nineoldandroids/a/a;)V

    .line 114
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b$2;->c:Lcom/qihoo/security/ui/main/b;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/b;->a(Lcom/qihoo/security/ui/main/b;)Lcom/nineoldandroids/a/k;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 115
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b$2;->c:Lcom/qihoo/security/ui/main/b;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/b;->a(Lcom/qihoo/security/ui/main/b;)Lcom/nineoldandroids/a/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->a()V

    .line 117
    :cond_1
    return-void
.end method

.method public c(Lcom/nineoldandroids/a/a;)V
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b$2;->b:Lcom/nineoldandroids/a/a$a;

    if-eqz v0, :cond_0

    .line 122
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b$2;->b:Lcom/nineoldandroids/a/a$a;

    invoke-interface {v0, p1}, Lcom/nineoldandroids/a/a$a;->c(Lcom/nineoldandroids/a/a;)V

    .line 124
    :cond_0
    return-void
.end method

.method public d(Lcom/nineoldandroids/a/a;)V
    .locals 1

    .prologue
    .line 103
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b$2;->b:Lcom/nineoldandroids/a/a$a;

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b$2;->b:Lcom/nineoldandroids/a/a$a;

    invoke-interface {v0, p1}, Lcom/nineoldandroids/a/a$a;->d(Lcom/nineoldandroids/a/a;)V

    .line 106
    :cond_0
    return-void
.end method
