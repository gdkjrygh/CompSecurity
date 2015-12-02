.class public Lcom/facebook/orca/threadview/as;
.super Landroid/app/AlertDialog;
.source "ThreadNamePicker.java"


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Landroid/view/inputmethod/InputMethodManager;

.field private c:Lcom/facebook/orca/threadview/aw;

.field private d:Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 47
    invoke-direct {p0, p1}, Landroid/app/AlertDialog;-><init>(Landroid/content/Context;)V

    .line 48
    const-string v0, "input_method"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/facebook/orca/threadview/as;->b:Landroid/view/inputmethod/InputMethodManager;

    .line 50
    invoke-static {p2}, Lcom/facebook/common/w/n;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/as;->a:Ljava/lang/String;

    .line 51
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/as;->a(Landroid/content/Context;)V

    .line 52
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/as;)Landroid/widget/EditText;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/facebook/orca/threadview/as;->d:Landroid/widget/EditText;

    return-object v0
.end method

.method private a(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 55
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 56
    sget v1, Lcom/facebook/k;->orca_thread_name_dialog:I

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 57
    const-string v1, ""

    invoke-virtual {p0, v1}, Lcom/facebook/orca/threadview/as;->setTitle(Ljava/lang/CharSequence;)V

    .line 58
    invoke-virtual {p0, v2}, Lcom/facebook/orca/threadview/as;->setMessage(Ljava/lang/CharSequence;)V

    .line 59
    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/as;->setView(Landroid/view/View;)V

    .line 61
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/as;->getWindow()Landroid/view/Window;

    move-result-object v1

    .line 62
    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 64
    sget v1, Lcom/facebook/i;->thread_name_edit_text_field:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/facebook/orca/threadview/as;->d:Landroid/widget/EditText;

    .line 65
    iget-object v0, p0, Lcom/facebook/orca/threadview/as;->d:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/facebook/orca/threadview/as;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 66
    iget-object v0, p0, Lcom/facebook/orca/threadview/as;->d:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/facebook/orca/threadview/as;->d:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 68
    sget v0, Lcom/facebook/o;->thread_name_dialog_set_button:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/threadview/at;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/at;-><init>(Lcom/facebook/orca/threadview/as;)V

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/threadview/as;->setButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 89
    sget v0, Lcom/facebook/o;->dialog_cancel:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/threadview/au;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/au;-><init>(Lcom/facebook/orca/threadview/as;)V

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/threadview/as;->setButton2(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 101
    iget-object v0, p0, Lcom/facebook/orca/threadview/as;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 102
    sget v0, Lcom/facebook/o;->thread_name_dialog_remove_button:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/threadview/av;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/av;-><init>(Lcom/facebook/orca/threadview/as;)V

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/threadview/as;->setButton3(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 115
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/threadview/as;)Landroid/view/inputmethod/InputMethodManager;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/facebook/orca/threadview/as;->b:Landroid/view/inputmethod/InputMethodManager;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/orca/threadview/as;)Lcom/facebook/orca/threadview/aw;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/facebook/orca/threadview/as;->c:Lcom/facebook/orca/threadview/aw;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/orca/threadview/as;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/facebook/orca/threadview/as;->a:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/orca/threadview/aw;)V
    .locals 0

    .prologue
    .line 122
    iput-object p1, p0, Lcom/facebook/orca/threadview/as;->c:Lcom/facebook/orca/threadview/aw;

    .line 123
    return-void
.end method
