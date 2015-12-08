.class final Lkik/android/chat/fragment/ow;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikRegistrationFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikRegistrationFragment;)V
    .locals 0

    .prologue
    .line 158
    iput-object p1, p0, Lkik/android/chat/fragment/ow;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .prologue
    .line 162
    iget-object v0, p0, Lkik/android/chat/fragment/ow;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikRegistrationFragment;->b(Lkik/android/chat/fragment/KikRegistrationFragment;)Ljava/util/Calendar;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 163
    iget-object v0, p0, Lkik/android/chat/fragment/ow;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikRegistrationFragment;->b(Lkik/android/chat/fragment/KikRegistrationFragment;)Ljava/util/Calendar;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v4

    .line 164
    iget-object v0, p0, Lkik/android/chat/fragment/ow;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikRegistrationFragment;->b(Lkik/android/chat/fragment/KikRegistrationFragment;)Ljava/util/Calendar;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 166
    iget-object v6, p0, Lkik/android/chat/fragment/ow;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    new-instance v0, Lkik/android/widget/cd;

    iget-object v1, p0, Lkik/android/chat/fragment/ow;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikRegistrationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/ow;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikRegistrationFragment;->c(Lkik/android/chat/fragment/KikRegistrationFragment;)Landroid/app/DatePickerDialog$OnDateSetListener;

    move-result-object v2

    invoke-direct/range {v0 .. v5}, Lkik/android/widget/cd;-><init>(Landroid/content/Context;Landroid/app/DatePickerDialog$OnDateSetListener;III)V

    invoke-static {v6, v0}, Lkik/android/chat/fragment/KikRegistrationFragment;->a(Lkik/android/chat/fragment/KikRegistrationFragment;Lkik/android/widget/cd;)Lkik/android/widget/cd;

    .line 167
    iget-object v0, p0, Lkik/android/chat/fragment/ow;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikRegistrationFragment;->d(Lkik/android/chat/fragment/KikRegistrationFragment;)Lkik/android/widget/cd;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ow;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikRegistrationFragment;->_firstnameField:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f090295

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/widget/cd;->a(Ljava/lang/String;)V

    .line 168
    iget-object v0, p0, Lkik/android/chat/fragment/ow;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikRegistrationFragment;->d(Lkik/android/chat/fragment/KikRegistrationFragment;)Lkik/android/widget/cd;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/widget/cd;->show()V

    .line 169
    return-void
.end method
