.class final Lcom/arist/model/skin/h;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field final synthetic a:Lcom/arist/model/skin/g;


# direct methods
.method constructor <init>(Lcom/arist/model/skin/g;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/skin/h;->a:Lcom/arist/model/skin/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 3

    const/4 v1, 0x0

    const/4 v0, 0x6

    if-ne p2, v0, :cond_2

    invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "input_method"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {p1}, Landroid/widget/TextView;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    iget-object v0, p0, Lcom/arist/model/skin/h;->a:Lcom/arist/model/skin/g;

    invoke-static {v0}, Lcom/arist/model/skin/g;->a(Lcom/arist/model/skin/g;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x5

    if-gt v1, v2, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0xa

    if-ge v1, v2, :cond_1

    :cond_0
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/arist/model/skin/ColorPickerPreference;->a(Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/arist/model/skin/h;->a:Lcom/arist/model/skin/g;

    invoke-static {v1}, Lcom/arist/model/skin/g;->b(Lcom/arist/model/skin/g;)Lcom/arist/model/skin/ColorPickerView;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/arist/model/skin/ColorPickerView;->a(I)V

    iget-object v0, p0, Lcom/arist/model/skin/h;->a:Lcom/arist/model/skin/g;

    invoke-static {v0}, Lcom/arist/model/skin/g;->a(Lcom/arist/model/skin/g;)Landroid/widget/EditText;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/model/skin/h;->a:Lcom/arist/model/skin/g;

    invoke-static {v1}, Lcom/arist/model/skin/g;->c(Lcom/arist/model/skin/g;)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setTextColor(Landroid/content/res/ColorStateList;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0

    :catch_0
    move-exception v0

    :cond_1
    iget-object v0, p0, Lcom/arist/model/skin/h;->a:Lcom/arist/model/skin/g;

    invoke-static {v0}, Lcom/arist/model/skin/g;->a(Lcom/arist/model/skin/g;)Landroid/widget/EditText;

    move-result-object v0

    const/high16 v1, -0x10000

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setTextColor(I)V

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_1
.end method
