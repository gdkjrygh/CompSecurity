.class Lcom/facebook/orca/contacts/divebar/bg;
.super Ljava/lang/Object;
.source "DivebarPickerView.java"

# interfaces
.implements Lcom/facebook/contacts/picker/bc;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/divebar/be;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/divebar/be;)V
    .locals 0

    .prologue
    .line 80
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/bg;->a:Lcom/facebook/orca/contacts/divebar/be;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/bg;->a:Lcom/facebook/orca/contacts/divebar/be;

    invoke-static {v0}, Lcom/facebook/orca/contacts/divebar/be;->a(Lcom/facebook/orca/contacts/divebar/be;)Lcom/facebook/orca/contacts/divebar/bl;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 84
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/bg;->a:Lcom/facebook/orca/contacts/divebar/be;

    invoke-static {v0}, Lcom/facebook/orca/contacts/divebar/be;->a(Lcom/facebook/orca/contacts/divebar/be;)Lcom/facebook/orca/contacts/divebar/bl;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/orca/contacts/divebar/bl;->a()V

    .line 86
    :cond_0
    return-void
.end method
