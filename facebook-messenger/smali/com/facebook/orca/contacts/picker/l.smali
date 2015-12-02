.class Lcom/facebook/orca/contacts/picker/l;
.super Ljava/lang/Object;
.source "ContactPickerAddPhoneOrEmailView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/facebook/orca/contacts/picker/k;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/picker/k;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 131
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/l;->b:Lcom/facebook/orca/contacts/picker/k;

    iput-object p2, p0, Lcom/facebook/orca/contacts/picker/l;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/l;->b:Lcom/facebook/orca/contacts/picker/k;

    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/l;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/facebook/orca/contacts/picker/k;->a(Lcom/facebook/orca/contacts/picker/k;Ljava/lang/String;)V

    .line 135
    return-void
.end method
