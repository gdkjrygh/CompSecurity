.class Lcom/facebook/orca/contacts/divebar/x;
.super Ljava/lang/Object;
.source "DivebarFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/divebar/DivebarFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/divebar/DivebarFragment;)V
    .locals 0

    .prologue
    .line 1037
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/x;->a:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 1040
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/x;->a:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    invoke-static {v0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->g(Lcom/facebook/orca/contacts/divebar/DivebarFragment;)V

    .line 1041
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/x;->a:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    invoke-static {v0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->f(Lcom/facebook/orca/contacts/divebar/DivebarFragment;)Lcom/facebook/orca/contacts/divebar/be;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/be;->c()V

    .line 1042
    return-void
.end method
