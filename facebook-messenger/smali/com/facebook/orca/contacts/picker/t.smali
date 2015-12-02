.class Lcom/facebook/orca/contacts/picker/t;
.super Ljava/lang/Object;
.source "ContactPickerFavoritesSectionHeaderView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/picker/s;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/picker/s;)V
    .locals 0

    .prologue
    .line 44
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/t;->a:Lcom/facebook/orca/contacts/picker/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/t;->a:Lcom/facebook/orca/contacts/picker/s;

    invoke-static {v0}, Lcom/facebook/orca/contacts/picker/s;->a(Lcom/facebook/orca/contacts/picker/s;)V

    .line 49
    return-void
.end method
