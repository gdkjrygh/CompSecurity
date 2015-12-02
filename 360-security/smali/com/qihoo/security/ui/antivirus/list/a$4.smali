.class Lcom/qihoo/security/ui/antivirus/list/a$4;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/list/a;->a(Lcom/qihoo/security/opti/trashclear/ui/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/i;

.field final synthetic b:Lcom/qihoo/security/ui/antivirus/list/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/list/a;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 0

    .prologue
    .line 113
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/list/a$4;->b:Lcom/qihoo/security/ui/antivirus/list/a;

    iput-object p2, p0, Lcom/qihoo/security/ui/antivirus/list/a$4;->a:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 116
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/a$4;->b:Lcom/qihoo/security/ui/antivirus/list/a;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/list/a;->a(Lcom/qihoo/security/ui/antivirus/list/a;)Lcom/qihoo/security/ui/antivirus/list/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 117
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/a$4;->b:Lcom/qihoo/security/ui/antivirus/list/a;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/list/a;->a(Lcom/qihoo/security/ui/antivirus/list/a;)Lcom/qihoo/security/ui/antivirus/list/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/a$4;->a:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0, v1}, Lcom/qihoo/security/ui/antivirus/list/a$a;->a(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 119
    :cond_0
    return-void
.end method
