.class Lcom/qihoo/security/ui/main/b$3;
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
    .line 130
    iput-object p1, p0, Lcom/qihoo/security/ui/main/b$3;->c:Lcom/qihoo/security/ui/main/b;

    iput-object p2, p0, Lcom/qihoo/security/ui/main/b$3;->a:Landroid/view/View;

    iput-object p3, p0, Lcom/qihoo/security/ui/main/b$3;->b:Lcom/nineoldandroids/a/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 134
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b$3;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 135
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b$3;->b:Lcom/nineoldandroids/a/a$a;

    if-eqz v0, :cond_0

    .line 136
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b$3;->b:Lcom/nineoldandroids/a/a$a;

    invoke-interface {v0, p1}, Lcom/nineoldandroids/a/a$a;->a(Lcom/nineoldandroids/a/a;)V

    .line 138
    :cond_0
    return-void
.end method

.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 1

    .prologue
    .line 149
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b$3;->b:Lcom/nineoldandroids/a/a$a;

    if-eqz v0, :cond_0

    .line 150
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b$3;->b:Lcom/nineoldandroids/a/a$a;

    invoke-interface {v0, p1}, Lcom/nineoldandroids/a/a$a;->b(Lcom/nineoldandroids/a/a;)V

    .line 153
    :cond_0
    return-void
.end method

.method public c(Lcom/nineoldandroids/a/a;)V
    .locals 1

    .prologue
    .line 157
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b$3;->b:Lcom/nineoldandroids/a/a$a;

    if-eqz v0, :cond_0

    .line 158
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b$3;->b:Lcom/nineoldandroids/a/a$a;

    invoke-interface {v0, p1}, Lcom/nineoldandroids/a/a$a;->c(Lcom/nineoldandroids/a/a;)V

    .line 160
    :cond_0
    return-void
.end method

.method public d(Lcom/nineoldandroids/a/a;)V
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b$3;->b:Lcom/nineoldandroids/a/a$a;

    if-eqz v0, :cond_0

    .line 143
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b$3;->b:Lcom/nineoldandroids/a/a$a;

    invoke-interface {v0, p1}, Lcom/nineoldandroids/a/a$a;->d(Lcom/nineoldandroids/a/a;)V

    .line 145
    :cond_0
    return-void
.end method
