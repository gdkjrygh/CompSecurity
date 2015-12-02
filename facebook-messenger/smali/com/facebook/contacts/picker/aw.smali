.class Lcom/facebook/contacts/picker/aw;
.super Ljava/lang/Object;
.source "SearchableContactPickerView.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/picker/as;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/picker/as;)V
    .locals 0

    .prologue
    .line 130
    iput-object p1, p0, Lcom/facebook/contacts/picker/aw;->a:Lcom/facebook/contacts/picker/as;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lcom/facebook/contacts/picker/aw;->a:Lcom/facebook/contacts/picker/as;

    invoke-static {v0, p2}, Lcom/facebook/contacts/picker/as;->a(Lcom/facebook/contacts/picker/as;Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method
