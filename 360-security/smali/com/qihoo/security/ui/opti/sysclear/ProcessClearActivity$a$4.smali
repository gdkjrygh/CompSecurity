.class Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$4;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/a/a/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;)V
    .locals 0

    .prologue
    .line 1746
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$4;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 1749
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$4;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Landroid/widget/ExpandableListView;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setEnabled(Z)V

    .line 1754
    return-void
.end method
