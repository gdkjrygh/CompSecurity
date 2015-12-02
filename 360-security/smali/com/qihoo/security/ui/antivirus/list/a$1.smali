.class Lcom/qihoo/security/ui/antivirus/list/a$1;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/list/a;->a(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/qihoo/security/opti/trashclear/ui/i;

.field final synthetic c:Lcom/qihoo/security/ui/antivirus/list/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/list/a;Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 0

    .prologue
    .line 62
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/list/a$1;->c:Lcom/qihoo/security/ui/antivirus/list/a;

    iput-object p2, p0, Lcom/qihoo/security/ui/antivirus/list/a$1;->a:Landroid/view/View;

    iput-object p3, p0, Lcom/qihoo/security/ui/antivirus/list/a$1;->b:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 3

    .prologue
    .line 66
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/a$1;->c:Lcom/qihoo/security/ui/antivirus/list/a;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/a$1;->a:Landroid/view/View;

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/a$1;->b:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/ui/antivirus/list/a;->a(Lcom/qihoo/security/ui/antivirus/list/a;Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 67
    return-void
.end method
