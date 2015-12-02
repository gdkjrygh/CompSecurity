.class public Lcom/facebook/contacts/contactcard/entry/b;
.super Lcom/facebook/widget/CustomRelativeLayout;
.source "CreatePhoneEntryView.java"


# instance fields
.field private final a:Landroid/view/inputmethod/InputMethodManager;

.field private final b:Landroid/widget/EditText;

.field private final c:Landroid/widget/ImageButton;

.field private d:Lcom/facebook/contacts/contactcard/entry/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 37
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/contacts/contactcard/entry/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 38
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/contacts/contactcard/entry/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 42
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 45
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/CustomRelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 47
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/entry/b;->getInjector()Lcom/facebook/inject/t;

    move-result-object v0

    .line 48
    const-class v1, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/entry/b;->a:Landroid/view/inputmethod/InputMethodManager;

    .line 50
    sget v0, Lcom/facebook/k;->contacts_create_phone_entry_view:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/entry/b;->setContentView(I)V

    .line 51
    sget v0, Lcom/facebook/i;->contacts_create_number_input:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/entry/b;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/entry/b;->b:Landroid/widget/EditText;

    .line 52
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/entry/b;->b:Landroid/widget/EditText;

    new-instance v1, Lcom/facebook/contacts/contactcard/entry/c;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/contactcard/entry/c;-><init>(Lcom/facebook/contacts/contactcard/entry/b;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 65
    sget v0, Lcom/facebook/i;->contacts_add_hidden_phone_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/entry/b;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/entry/b;->c:Landroid/widget/ImageButton;

    .line 66
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/entry/b;->c:Landroid/widget/ImageButton;

    new-instance v1, Lcom/facebook/contacts/contactcard/entry/d;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/contactcard/entry/d;-><init>(Lcom/facebook/contacts/contactcard/entry/b;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/contactcard/entry/b;)Lcom/facebook/contacts/contactcard/entry/e;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/entry/b;->d:Lcom/facebook/contacts/contactcard/entry/e;

    return-object v0
.end method


# virtual methods
.method public getInputValue()Ljava/lang/String;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/entry/b;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected onWindowVisibilityChanged(I)V
    .locals 3

    .prologue
    .line 78
    const/16 v0, 0x8

    if-ne p1, v0, :cond_0

    .line 79
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/entry/b;->a:Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/entry/b;->b:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 80
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/entry/b;->b:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 82
    :cond_0
    return-void
.end method

.method public setListener(Lcom/facebook/contacts/contactcard/entry/e;)V
    .locals 0

    .prologue
    .line 85
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/entry/b;->d:Lcom/facebook/contacts/contactcard/entry/e;

    .line 86
    return-void
.end method

.method public setPlusButtonVisibility(Z)V
    .locals 2

    .prologue
    .line 89
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/entry/b;->c:Landroid/widget/ImageButton;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 90
    return-void

    .line 89
    :cond_0
    const/4 v0, 0x4

    goto :goto_0
.end method
