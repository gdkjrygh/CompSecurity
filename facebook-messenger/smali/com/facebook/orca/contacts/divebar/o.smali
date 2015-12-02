.class Lcom/facebook/orca/contacts/divebar/o;
.super Ljava/lang/Object;
.source "DivebarContactsUploaderView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/divebar/m;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/divebar/m;)V
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/o;->a:Lcom/facebook/orca/contacts/divebar/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/o;->a:Lcom/facebook/orca/contacts/divebar/m;

    invoke-static {v0}, Lcom/facebook/orca/contacts/divebar/m;->a(Lcom/facebook/orca/contacts/divebar/m;)Lcom/facebook/analytics/av;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "click"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "button"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "divebar_contacts_uploader_learn_more_btn"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 66
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/o;->a:Lcom/facebook/orca/contacts/divebar/m;

    invoke-static {v0}, Lcom/facebook/orca/contacts/divebar/m;->b(Lcom/facebook/orca/contacts/divebar/m;)Lcom/facebook/orca/contacts/divebar/q;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/orca/contacts/divebar/q;->b()V

    .line 67
    return-void
.end method
