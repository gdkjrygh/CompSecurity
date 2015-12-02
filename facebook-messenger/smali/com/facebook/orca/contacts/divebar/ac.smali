.class Lcom/facebook/orca/contacts/divebar/ac;
.super Ljava/lang/Object;
.source "DivebarGroupsMegaphoneController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/divebar/aa;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/divebar/aa;)V
    .locals 0

    .prologue
    .line 101
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/ac;->a:Lcom/facebook/orca/contacts/divebar/aa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ac;->a:Lcom/facebook/orca/contacts/divebar/aa;

    invoke-static {v0}, Lcom/facebook/orca/contacts/divebar/aa;->b(Lcom/facebook/orca/contacts/divebar/aa;)V

    .line 105
    return-void
.end method
