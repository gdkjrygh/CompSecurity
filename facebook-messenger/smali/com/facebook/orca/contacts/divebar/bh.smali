.class Lcom/facebook/orca/contacts/divebar/bh;
.super Ljava/lang/Object;
.source "DivebarPickerView.java"

# interfaces
.implements Lcom/facebook/contacts/picker/bb;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/divebar/be;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/divebar/be;)V
    .locals 0

    .prologue
    .line 90
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/bh;->a:Lcom/facebook/orca/contacts/divebar/be;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/bh;->a:Lcom/facebook/orca/contacts/divebar/be;

    invoke-static {v0}, Lcom/facebook/orca/contacts/divebar/be;->a(Lcom/facebook/orca/contacts/divebar/be;)Lcom/facebook/orca/contacts/divebar/bl;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 94
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/bh;->a:Lcom/facebook/orca/contacts/divebar/be;

    invoke-static {v0}, Lcom/facebook/orca/contacts/divebar/be;->a(Lcom/facebook/orca/contacts/divebar/be;)Lcom/facebook/orca/contacts/divebar/bl;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/facebook/orca/contacts/divebar/bl;->a(Ljava/lang/String;)V

    .line 96
    :cond_0
    return-void
.end method
