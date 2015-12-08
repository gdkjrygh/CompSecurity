.class public Lkik/android/chat/fragment/KikRegistrationFragment;
.super Lkik/android/chat/fragment/KikIqFragmentBase;
.source "SourceFile"

# interfaces
.implements Lkik/android/e/d;


# instance fields
.field private A:Ljava/text/DateFormat;

.field private final B:Ljava/util/Date;

.field private C:Z

.field private D:Z

.field private E:Ljava/util/Timer;

.field private final F:I

.field private G:Landroid/view/View$OnClickListener;

.field private H:Landroid/view/View$OnClickListener;

.field private I:Landroid/app/DatePickerDialog$OnDateSetListener;

.field private J:Landroid/text/TextWatcher;

.field private K:Landroid/text/TextWatcher;

.field _birthdayField:Landroid/widget/EditText;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0084
    .end annotation
.end field

.field _emailField:Lkik/android/widget/KikAutoCompleteTextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0082
    .end annotation
.end field

.field _firstnameField:Landroid/widget/EditText;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e007f
    .end annotation
.end field

.field _lastnameField:Landroid/widget/EditText;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0080
    .end annotation
.end field

.field _passwordField:Landroid/widget/EditText;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0083
    .end annotation
.end field

.field _profPic:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e007e
    .end annotation
.end field

.field _registerButton:Landroid/widget/Button;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0085
    .end annotation
.end field

.field _usernameField:Landroid/widget/EditText;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0081
    .end annotation
.end field

.field protected a:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected b:Lkik/a/e/n;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected c:Lkik/a/e/t;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected d:Lkik/a/e/w;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected e:Lkik/a/e/v;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected f:Lkik/a/e/f;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected g:Lkik/a/f/k;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected h:Lkik/a/aa;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected i:Lkik/android/util/ar;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private j:I

.field private k:I

.field private l:Z

.field private m:Lcom/kik/g/f;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Landroid/graphics/drawable/Drawable;

.field private r:Landroid/graphics/drawable/Drawable;

.field private s:Landroid/graphics/drawable/AnimationDrawable;

.field private t:Landroid/widget/Toast;

.field private x:Lcom/kik/view/adapters/v;

.field private y:Lkik/android/widget/cd;

.field private z:Ljava/util/Calendar;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 92
    invoke-direct {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;-><init>()V

    .line 122
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->m:Lcom/kik/g/f;

    .line 124
    const-string v0, ""

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->o:Ljava/lang/String;

    .line 132
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->z:Ljava/util/Calendar;

    .line 133
    invoke-static {}, Ljava/text/DateFormat;->getDateInstance()Ljava/text/DateFormat;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->A:Ljava/text/DateFormat;

    .line 134
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->B:Ljava/util/Date;

    .line 141
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->C:Z

    .line 143
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->D:Z

    .line 145
    new-instance v0, Ljava/util/Timer;

    const-string v1, "UsernameCheckTimer"

    invoke-direct {v0, v1}, Ljava/util/Timer;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->E:Ljava/util/Timer;

    .line 147
    const/16 v0, 0x11

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    iput v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->F:I

    .line 149
    new-instance v0, Lkik/android/chat/fragment/ok;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ok;-><init>(Lkik/android/chat/fragment/KikRegistrationFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->G:Landroid/view/View$OnClickListener;

    .line 158
    new-instance v0, Lkik/android/chat/fragment/ow;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ow;-><init>(Lkik/android/chat/fragment/KikRegistrationFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->H:Landroid/view/View$OnClickListener;

    .line 172
    new-instance v0, Lkik/android/chat/fragment/oy;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/oy;-><init>(Lkik/android/chat/fragment/KikRegistrationFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->I:Landroid/app/DatePickerDialog$OnDateSetListener;

    .line 303
    new-instance v0, Lkik/android/chat/fragment/oz;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/oz;-><init>(Lkik/android/chat/fragment/KikRegistrationFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->J:Landroid/text/TextWatcher;

    .line 323
    new-instance v0, Lkik/android/chat/fragment/pa;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/pa;-><init>(Lkik/android/chat/fragment/KikRegistrationFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->K:Landroid/text/TextWatcher;

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikRegistrationFragment;Ljava/util/Timer;)Ljava/util/Timer;
    .locals 0

    .prologue
    .line 92
    iput-object p1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->E:Ljava/util/Timer;

    return-object p1
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikRegistrationFragment;Lkik/android/widget/cd;)Lkik/android/widget/cd;
    .locals 0

    .prologue
    .line 92
    iput-object p1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->y:Lkik/android/widget/cd;

    return-object p1
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikRegistrationFragment;)V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->c()V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikRegistrationFragment;Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 92
    if-nez p1, :cond_1

    invoke-direct {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->f()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v0, "extra.resultUrl"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->o:Ljava/lang/String;

    invoke-direct {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->c()V

    goto :goto_0

    :cond_2
    const-string v0, "network"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    const v1, 0x7f09017a

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikRegistrationFragment;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 92
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->D:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/oq;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/oq;-><init>(Lkik/android/chat/fragment/KikRegistrationFragment;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    new-instance v0, Lkik/a/f/f/af;

    invoke-direct {v0, p0, p1}, Lkik/a/f/f/af;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikRegistrationFragment;->a(Lkik/a/f/f/y;)V

    :cond_1
    return-void
.end method

.method public static a(Lkik/android/util/ar;)V
    .locals 1

    .prologue
    .line 297
    const-string v0, "com.kik.android.registerSharedPrefs"

    invoke-interface {p0, v0}, Lkik/android/util/ar;->a(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 298
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 299
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/util/p;->g()V

    .line 300
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/util/p;->h()V

    .line 301
    return-void
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikRegistrationFragment;)Ljava/util/Calendar;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->z:Ljava/util/Calendar;

    return-object v0
.end method

.method private b()V
    .locals 3

    .prologue
    .line 183
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->z:Ljava/util/Calendar;

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroid/text/format/DateUtils;->isToday(J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 184
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_birthdayField:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 189
    :goto_0
    return-void

    .line 187
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_birthdayField:Landroid/widget/EditText;

    iget-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->A:Ljava/text/DateFormat;

    iget-object v2, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->z:Ljava/util/Calendar;

    invoke-virtual {v2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method static synthetic c(Lkik/android/chat/fragment/KikRegistrationFragment;)Landroid/app/DatePickerDialog$OnDateSetListener;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->I:Landroid/app/DatePickerDialog$OnDateSetListener;

    return-object v0
.end method

.method private c()V
    .locals 14

    .prologue
    const v3, 0x7f0901eb

    .line 193
    iget v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->j:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->j:I

    .line 195
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->a:Lcom/kik/android/a;

    const-string v1, "Register Complete"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Attempts"

    invoke-virtual {v0, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;)Lcom/kik/android/a$f;

    .line 197
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_usernameField:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    .line 198
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_passwordField:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 199
    iget-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    invoke-virtual {v1}, Lkik/android/widget/KikAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 200
    iget-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_firstnameField:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    .line 201
    iget-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_lastnameField:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    .line 202
    iget-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->B:Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    iget-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->z:Ljava/util/Calendar;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v10

    sub-long/2addr v4, v10

    .line 204
    const/4 v12, 0x0

    .line 206
    iget-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_firstnameField:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    .line 207
    if-nez v13, :cond_1

    .line 293
    :cond_0
    :goto_0
    return-void

    .line 211
    :cond_1
    invoke-virtual {v13, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 212
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    const v1, 0x7f0901b8

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setText(I)V

    .line 213
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 215
    const-string v0, "First Name"

    .line 286
    :goto_1
    if-eqz v0, :cond_0

    .line 287
    iget-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->a:Lcom/kik/android/a;

    const-string v2, "Register Error"

    invoke-virtual {v1, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Reason"

    invoke-virtual {v1, v2, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->g()Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto :goto_0

    .line 217
    :cond_2
    invoke-virtual {v13, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 218
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    const v1, 0x7f0901b9

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setText(I)V

    .line 219
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 221
    const-string v0, "Last Name"

    goto :goto_1

    .line 223
    :cond_3
    const v1, 0x7f0901ee

    invoke-virtual {v13, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 224
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_4

    .line 225
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    const v1, 0x7f090356

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setText(I)V

    .line 226
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 228
    const-string v0, "Username Too Short"

    goto :goto_1

    .line 230
    :cond_4
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x14

    if-le v0, v1, :cond_5

    .line 231
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    const v1, 0x7f090355

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setText(I)V

    .line 232
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 234
    const-string v0, "Username Too Long"

    goto :goto_1

    .line 237
    :cond_5
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    const v1, 0x7f090351

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setText(I)V

    .line 238
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 240
    const-string v0, "Username Invalid"

    goto :goto_1

    .line 243
    :cond_6
    const v1, 0x7f0901e9

    invoke-virtual {v13, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 244
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    const v1, 0x7f0900d2

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setText(I)V

    .line 245
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 247
    const-string v0, "Email"

    goto/16 :goto_1

    .line 249
    :cond_7
    const v1, 0x7f0901ec

    invoke-virtual {v13, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_8

    .line 250
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    const v1, 0x7f0901a7

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setText(I)V

    .line 251
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 253
    const-string v0, "Password"

    goto/16 :goto_1

    .line 255
    :cond_8
    iget-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->z:Ljava/util/Calendar;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v10

    invoke-static {v10, v11}, Landroid/text/format/DateUtils;->isToday(J)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 256
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    const v1, 0x7f090052

    invoke-virtual {v13, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 257
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    move-object v0, v12

    goto/16 :goto_1

    .line 259
    :cond_9
    const-wide v10, 0x2c15e09200L

    cmp-long v1, v4, v10

    if-gez v1, :cond_a

    .line 260
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    const v1, 0x7f090050

    invoke-virtual {v13, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 261
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    move-object v0, v12

    goto/16 :goto_1

    .line 263
    :cond_a
    const-wide v10, 0x5f84bbe700L

    cmp-long v1, v4, v10

    if-gez v1, :cond_b

    .line 264
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    const v1, 0x7f090051

    invoke-virtual {v13, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 265
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 267
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->J()V

    move-object v0, v12

    goto/16 :goto_1

    .line 270
    :cond_b
    new-instance v11, Ljava/util/Hashtable;

    invoke-direct {v11}, Ljava/util/Hashtable;-><init>()V

    .line 271
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v3, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->i:Lkik/android/util/ar;

    invoke-static {v1, v3}, Lkik/android/util/DeviceUtils;->a(Landroid/content/Context;Lkik/android/util/ar;)Ljava/util/Hashtable;

    move-result-object v1

    invoke-virtual {v11, v1}, Ljava/util/Hashtable;->putAll(Ljava/util/Map;)V

    .line 273
    iget-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->c:Lkik/a/e/t;

    invoke-interface {v1, v0}, Lkik/a/e/t;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->p:Ljava/lang/String;

    .line 275
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->p:Ljava/lang/String;

    const-string v1, "niCRwL7isZHny24qgLvy"

    invoke-static {v0, v2, v1}, Lkik/a/h/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/cq;->a([B)Ljava/lang/String;

    move-result-object v4

    .line 276
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->p:Ljava/lang/String;

    const-string v1, "niCRwL7isZHny24qgLvy"

    invoke-static {v0, v6, v1}, Lkik/a/h/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/cq;->a([B)Ljava/lang/String;

    move-result-object v5

    .line 278
    new-instance v0, Lkik/a/f/f/ad;

    invoke-static {}, Lkik/android/chat/KikApplication;->b()Ljava/lang/String;

    move-result-object v3

    iget-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->z:Ljava/util/Calendar;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v9

    iget-object v10, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->o:Ljava/lang/String;

    move-object v1, p0

    invoke-direct/range {v0 .. v11}, Lkik/a/f/f/ad;-><init>(Lkik/a/f/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/util/Hashtable;)V

    .line 282
    const v1, 0x7f0901ef

    invoke-virtual {v13, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lkik/android/chat/fragment/KikRegistrationFragment;->a(Lkik/a/f/f/y;Ljava/lang/String;Z)V

    .line 283
    const-string v0, ""

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->o:Ljava/lang/String;

    move-object v0, v12

    goto/16 :goto_1
.end method

.method static synthetic d(Lkik/android/chat/fragment/KikRegistrationFragment;)Lkik/android/widget/cd;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->y:Lkik/android/widget/cd;

    return-object v0
.end method

.method private d()V
    .locals 5

    .prologue
    .line 781
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    new-instance v1, Lkik/android/chat/fragment/ou;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ou;-><init>(Lkik/android/chat/fragment/KikRegistrationFragment;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/KikAutoCompleteTextView;->post(Ljava/lang/Runnable;)Z

    .line 789
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->i:Lkik/android/util/ar;

    invoke-static {v0}, Lkik/android/chat/fragment/KikRegistrationFragment;->a(Lkik/android/util/ar;)V

    .line 792
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->i:Lkik/android/util/ar;

    invoke-interface {v0}, Lkik/android/util/ar;->c()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 793
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "kik.registration_count"

    const-string v3, "kik.registration_count"

    const/4 v4, 0x0

    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 797
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikRegistrationFragment;->a(Landroid/os/Bundle;)V

    .line 798
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->J()V

    .line 800
    new-instance v0, Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikConversationsFragment$a;-><init>()V

    iget-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    invoke-virtual {v1}, Lkik/android/widget/KikAutoCompleteTextView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    .line 801
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->d:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->g()V

    .line 803
    return-void
.end method

.method static synthetic e(Lkik/android/chat/fragment/KikRegistrationFragment;)V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->b()V

    return-void
.end method

.method static synthetic f(Lkik/android/chat/fragment/KikRegistrationFragment;)Ljava/util/Timer;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->E:Ljava/util/Timer;

    return-object v0
.end method

.method private f()V
    .locals 2

    .prologue
    .line 927
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    const v1, 0x7f090063

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 928
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 929
    return-void
.end method

.method static synthetic g(Lkik/android/chat/fragment/KikRegistrationFragment;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->r:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method static synthetic h(Lkik/android/chat/fragment/KikRegistrationFragment;)Z
    .locals 1

    .prologue
    .line 92
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->D:Z

    return v0
.end method

.method static synthetic i(Lkik/android/chat/fragment/KikRegistrationFragment;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->q:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method static synthetic j(Lkik/android/chat/fragment/KikRegistrationFragment;)I
    .locals 1

    .prologue
    .line 92
    iget v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->F:I

    return v0
.end method

.method static synthetic k(Lkik/android/chat/fragment/KikRegistrationFragment;)Landroid/graphics/drawable/AnimationDrawable;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->s:Landroid/graphics/drawable/AnimationDrawable;

    return-object v0
.end method

.method static synthetic l(Lkik/android/chat/fragment/KikRegistrationFragment;)V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->f()V

    return-void
.end method


# virtual methods
.method protected final K()I
    .locals 1

    .prologue
    .line 966
    const v0, 0x7f0902dc

    return v0
.end method

.method protected final a()V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 652
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->l:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_firstnameField:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 653
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->a:Lcom/kik/android/a;

    const-string v3, "Register Incomplete"

    invoke-virtual {v0, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v3

    const-string v4, "First Name Set"

    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_firstnameField:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    if-lez v0, :cond_1

    move v0, v1

    :goto_0
    invoke-virtual {v3, v4, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v3

    const-string v4, "Last Name Set"

    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_lastnameField:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    if-lez v0, :cond_2

    move v0, v1

    :goto_1
    invoke-virtual {v3, v4, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v3

    const-string v4, "Username Set"

    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_usernameField:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    if-lez v0, :cond_3

    move v0, v1

    :goto_2
    invoke-virtual {v3, v4, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v3

    const-string v4, "Email Set"

    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    invoke-virtual {v0}, Lkik/android/widget/KikAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    if-lez v0, :cond_4

    move v0, v1

    :goto_3
    invoke-virtual {v3, v4, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v3

    const-string v4, "Password Set"

    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_passwordField:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    if-lez v0, :cond_5

    move v0, v1

    :goto_4
    invoke-virtual {v3, v4, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v3, "Phone Number Set"

    iget-object v4, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->n:Ljava/lang/String;

    if-eqz v4, :cond_6

    iget-object v4, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->n:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_6

    :goto_5
    invoke-virtual {v0, v3, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Photo Set"

    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v2

    invoke-virtual {v2}, Lkik/android/util/p;->f()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Failed Username Lookup Attempts"

    iget v2, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->k:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/android/a$f;->b(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Attempts"

    iget v2, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->j:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/android/a$f;->b(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->g()Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 666
    :cond_0
    return-void

    :cond_1
    move v0, v2

    .line 653
    goto/16 :goto_0

    :cond_2
    move v0, v2

    goto :goto_1

    :cond_3
    move v0, v2

    goto :goto_2

    :cond_4
    move v0, v2

    goto :goto_3

    :cond_5
    move v0, v2

    goto :goto_4

    :cond_6
    move v1, v2

    goto :goto_5
.end method

.method public final a(Landroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 951
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->w()V

    .line 952
    invoke-direct {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->d()V

    .line 953
    return-void
.end method

.method protected final a(Lkik/a/f/f/z;)V
    .locals 6

    .prologue
    const/4 v0, 0x1

    .line 696
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->a(Lkik/a/f/f/z;)V

    .line 697
    instance-of v1, p1, Lkik/a/f/f/ad;

    if-eqz v1, :cond_3

    .line 698
    check-cast p1, Lkik/a/f/f/ad;

    iget-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    invoke-virtual {v1}, Lkik/android/widget/KikAutoCompleteTextView;->getContext()Landroid/content/Context;

    move-result-object v1

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->l:Z

    invoke-static {v1}, Lkik/android/widget/ce;->a(Landroid/content/Context;)V

    iget-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->d:Lkik/a/e/w;

    invoke-interface {v1}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    invoke-virtual {v2}, Lkik/android/widget/KikAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lkik/a/d/aa;->a:Ljava/lang/String;

    iget-object v2, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->d:Lkik/a/e/w;

    invoke-interface {v2, v1}, Lkik/a/e/w;->a(Lkik/a/d/aa;)V

    iget-object v2, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->d:Lkik/a/e/w;

    invoke-interface {v2, v1}, Lkik/a/e/w;->a(Lkik/a/d/aa;)V

    iget-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->d:Lkik/a/e/w;

    invoke-virtual {p1}, Lkik/a/f/f/ad;->d()Lkik/a/d/aa;

    move-result-object v2

    invoke-interface {v1, v2}, Lkik/a/e/w;->a(Lkik/a/d/aa;)V

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v2

    iget-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->e:Lkik/a/e/v;

    const-string v4, "kik.registrationtime"

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v4, v2}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Long;)Z

    new-instance v1, Lkik/a/d/j;

    invoke-virtual {p1}, Lkik/a/f/f/ad;->e()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->g:Lkik/a/f/k;

    invoke-interface {v3}, Lkik/a/f/k;->o()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lkik/a/d/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->h:Lkik/a/aa;

    iget-object v3, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->p:Ljava/lang/String;

    invoke-interface {v2, v1, v3, v0}, Lkik/a/aa;->a(Lkik/a/d/j;Ljava/lang/String;Z)V

    iget-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->a:Lcom/kik/android/a;

    const-string v2, "Register Complete"

    invoke-virtual {v1, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Attempts"

    const-wide/16 v4, 0x0

    invoke-virtual {v1, v2, v4, v5}, Lcom/kik/android/a$f;->b(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Has Profile Picture"

    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v3

    invoke-virtual {v3}, Lkik/android/util/p;->f()Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Failed Username Lookup Attempts"

    iget v3, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->k:I

    int-to-long v4, v3

    invoke-virtual {v1, v2, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Has Phone Number"

    iget-object v3, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->n:Ljava/lang/String;

    if-eqz v3, :cond_1

    iget-object v3, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->n:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_1

    :goto_0
    invoke-virtual {v1, v2, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->g()Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    invoke-static {}, Lkik/android/chat/KikApplication;->i()Lkik/android/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v0

    invoke-virtual {p1}, Lkik/a/f/f/ad;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/d/f;->a(Ljava/lang/String;)V

    invoke-static {}, Lkik/android/chat/KikApplication;->i()Lkik/android/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/a/b;->a()V

    iget-boolean v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->C:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    new-instance v1, Lkik/android/chat/fragment/ot;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ot;-><init>(Lkik/android/chat/fragment/KikRegistrationFragment;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/KikAutoCompleteTextView;->post(Ljava/lang/Runnable;)Z

    .line 721
    :cond_0
    :goto_1
    return-void

    .line 698
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->d()V

    goto :goto_1

    .line 700
    :cond_3
    instance-of v1, p1, Lkik/a/f/f/af;

    if-eqz v1, :cond_0

    .line 701
    iput-boolean v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->D:Z

    .line 702
    check-cast p1, Lkik/a/f/f/af;

    invoke-virtual {p1}, Lkik/a/f/f/af;->d()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 704
    if-nez v0, :cond_4

    .line 705
    iget v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->k:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->k:I

    .line 708
    :cond_4
    new-instance v1, Lkik/android/chat/fragment/os;

    invoke-direct {v1, p0, v0}, Lkik/android/chat/fragment/os;-><init>(Lkik/android/chat/fragment/KikRegistrationFragment;Z)V

    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/KikRegistrationFragment;->b(Ljava/lang/Runnable;)V

    goto :goto_1
.end method

.method protected final b(Lkik/a/f/f/z;)Z
    .locals 8

    .prologue
    const v7, 0x7f0901f2

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 809
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_0

    move v0, v3

    .line 882
    :goto_0
    return v0

    .line 812
    :cond_0
    instance-of v0, p1, Lkik/a/f/f/ad;

    if-eqz v0, :cond_2

    move-object v0, p1

    .line 813
    check-cast v0, Lkik/a/f/f/ad;

    .line 814
    const-string v2, "Unknown"

    .line 816
    iget-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_firstnameField:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    .line 817
    invoke-virtual {v0}, Lkik/a/f/f/ad;->l()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 856
    :goto_1
    new-array v6, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Lkik/a/f/f/ad;->m()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    aput-object v1, v6, v4

    invoke-virtual {v5, v7, v6}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->P:Ljava/lang/String;

    .line 857
    invoke-virtual {v0}, Lkik/a/f/f/z;->l()I

    move-result v0

    invoke-static {v0}, Lkik/android/util/cy;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->Q:Ljava/lang/String;

    .line 861
    :goto_2
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->a:Lcom/kik/android/a;

    const-string v1, "Register Error"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Reason"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->g()Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    move v0, v3

    .line 866
    goto :goto_0

    .line 819
    :pswitch_0
    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Lkik/a/f/f/ad;->m()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    aput-object v1, v2, v4

    invoke-virtual {v5, v7, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->P:Ljava/lang/String;

    .line 820
    const v1, 0x7f0900d0

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Lkik/a/f/f/ad;->m()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    aput-object v0, v2, v4

    invoke-virtual {v5, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->Q:Ljava/lang/String;

    .line 821
    const-string v2, "Email"

    goto :goto_2

    .line 825
    :pswitch_1
    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Lkik/a/f/f/ad;->m()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    aput-object v1, v2, v4

    invoke-virtual {v5, v7, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->P:Ljava/lang/String;

    .line 826
    const v1, 0x7f090350

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Lkik/a/f/f/ad;->f()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v4

    invoke-virtual {v5, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->Q:Ljava/lang/String;

    .line 827
    const-string v2, "Username Unavailable"

    goto :goto_2

    :pswitch_2
    move-object v1, p1

    .line 830
    check-cast v1, Lkik/a/f/f/ad;

    invoke-virtual {v1}, Lkik/a/f/f/ad;->g()Ljava/lang/String;

    move-result-object v1

    .line 831
    if-eqz v1, :cond_1

    .line 832
    check-cast p1, Lkik/a/f/f/ad;

    invoke-virtual {p1}, Lkik/a/f/f/ad;->g()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/kik/cards/browser/CaptchaWindowFragment$c;

    invoke-direct {v1}, Lcom/kik/cards/browser/CaptchaWindowFragment$c;-><init>()V

    invoke-virtual {v1, v0}, Lcom/kik/cards/browser/CaptchaWindowFragment$c;->a(Ljava/lang/String;)Lcom/kik/cards/browser/CaptchaWindowFragment$c;

    move-result-object v0

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/ox;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ox;-><init>(Lkik/android/chat/fragment/KikRegistrationFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    move v0, v4

    .line 833
    goto/16 :goto_0

    .line 836
    :cond_1
    new-array v6, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Lkik/a/f/f/ad;->m()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    aput-object v1, v6, v4

    invoke-virtual {v5, v7, v6}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->P:Ljava/lang/String;

    .line 837
    invoke-virtual {v0}, Lkik/a/f/f/z;->l()I

    move-result v0

    invoke-static {v0}, Lkik/android/util/cy;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->Q:Ljava/lang/String;

    goto/16 :goto_2

    .line 841
    :pswitch_3
    new-array v1, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Lkik/a/f/f/ad;->m()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    aput-object v0, v1, v4

    invoke-virtual {v5, v7, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->P:Ljava/lang/String;

    .line 842
    check-cast p1, Lkik/a/f/f/ad;

    invoke-virtual {p1}, Lkik/a/f/f/ad;->n()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->Q:Ljava/lang/String;

    .line 843
    const-string v2, "Unknown"

    goto/16 :goto_2

    .line 846
    :pswitch_4
    iget-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    const v2, 0x7f090051

    invoke-virtual {v5, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 847
    iget-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 848
    const-string v1, "Birthday"

    .line 849
    iget-object v2, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->a:Lcom/kik/android/a;

    const-string v6, "Register Error"

    invoke-virtual {v2, v6}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v6, "Reason"

    invoke-virtual {v2, v6, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kik/android/a$f;->g()Lcom/kik/android/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kik/android/a$f;->b()V

    .line 854
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->J()V

    move-object v2, v1

    goto/16 :goto_1

    .line 868
    :cond_2
    instance-of v0, p1, Lkik/a/f/f/af;

    if-eqz v0, :cond_3

    .line 869
    iget v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->k:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->k:I

    .line 871
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 872
    if-eqz v0, :cond_3

    .line 873
    new-instance v1, Lkik/android/chat/fragment/ov;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ov;-><init>(Lkik/android/chat/fragment/KikRegistrationFragment;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_3
    move v0, v4

    .line 882
    goto/16 :goto_0

    .line 817
    :pswitch_data_0
    .packed-switch 0xc9
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_1
    .end packed-switch
.end method

.method public final k_()V
    .locals 3

    .prologue
    .line 958
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->w()V

    .line 959
    invoke-direct {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->d()V

    .line 960
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "Picture upload failed. Please retry from settings"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 961
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 7

    .prologue
    const/4 v1, -0x1

    .line 907
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_firstnameField:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    .line 908
    const/16 v0, 0x285e

    if-eq p1, v0, :cond_0

    const/16 v0, 0x285f

    if-ne p1, v0, :cond_2

    :cond_0
    if-ne p2, v1, :cond_2

    .line 910
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v0

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    iget-object v5, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->b:Lkik/a/e/n;

    move-object v1, p0

    move v3, p1

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, Lkik/android/util/p;->a(Landroid/support/v4/app/Fragment;Landroid/content/Context;ILandroid/content/Intent;Lkik/a/e/n;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 911
    const v0, 0x7f0902ba

    invoke-virtual {v6, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f090062

    invoke-virtual {v6, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {v2, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    invoke-virtual {v2, v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v1, 0x7f090193

    new-instance v2, Lkik/android/chat/fragment/or;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/or;-><init>(Lkik/android/chat/fragment/KikRegistrationFragment;)V

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    iget-object v0, v0, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikRegistrationFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 923
    :cond_1
    :goto_0
    return-void

    .line 914
    :cond_2
    const/16 v0, 0x2860

    if-ne p1, v0, :cond_1

    if-ne p2, v1, :cond_1

    .line 916
    :try_start_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_profPic:Landroid/widget/ImageView;

    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/util/p;->d()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 917
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->C:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 920
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/util/p;->g()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/util/p;->g()V

    throw v0
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 381
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->onAttach(Landroid/app/Activity;)V

    .line 383
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/cr;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->n:Ljava/lang/String;

    .line 385
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/KikApplication;

    .line 387
    iget-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->m:Lcom/kik/g/f;

    invoke-virtual {v0}, Lkik/android/chat/KikApplication;->o()Lcom/kik/g/e;

    move-result-object v0

    new-instance v2, Lkik/android/chat/fragment/pc;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/pc;-><init>(Lkik/android/chat/fragment/KikRegistrationFragment;)V

    invoke-virtual {v1, v0, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 394
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .prologue
    .line 368
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 370
    iget v0, p1, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    if-eqz v0, :cond_0

    .line 371
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    invoke-virtual {v0}, Lkik/android/widget/KikAutoCompleteTextView;->isPopupShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 372
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    invoke-virtual {v0}, Lkik/android/widget/KikAutoCompleteTextView;->dismissDropDown()V

    .line 373
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    invoke-virtual {v0}, Lkik/android/widget/KikAutoCompleteTextView;->showDropDown()V

    .line 376
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/16 v2, 0x3b

    .line 399
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->onCreate(Landroid/os/Bundle;)V

    .line 400
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/KikRegistrationFragment;)V

    .line 401
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->B:Ljava/util/Date;

    invoke-virtual {v0, v2}, Ljava/util/Date;->setMinutes(I)V

    .line 402
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->B:Ljava/util/Date;

    const/16 v1, 0x17

    invoke-virtual {v0, v1}, Ljava/util/Date;->setHours(I)V

    .line 403
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->B:Ljava/util/Date;

    invoke-virtual {v0, v2}, Ljava/util/Date;->setMinutes(I)V

    .line 404
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    .prologue
    .line 409
    const v0, 0x7f030013

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 411
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->a:Lcom/kik/android/a;

    const-string v2, "Register Shown"

    invoke-virtual {v0, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->g()Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 413
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v2, ""

    const/4 v3, 0x1

    invoke-static {v0, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->t:Landroid/widget/Toast;

    .line 415
    const v0, 0x7f0e001d

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v2, Lkik/android/chat/fragment/pd;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/pd;-><init>(Lkik/android/chat/fragment/KikRegistrationFragment;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 424
    invoke-static {p0, v1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 425
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    const-string v2, "AUTOMATION_TITLE_EMAIL"

    invoke-virtual {v0, v2}, Lkik/android/widget/KikAutoCompleteTextView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 426
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_registerButton:Landroid/widget/Button;

    const-string v2, "AUTOMATION_TITLE_REGISTER"

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 427
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_birthdayField:Landroid/widget/EditText;

    const-string v2, "AUTOMATION_TITLE_BIRTHDAY"

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 429
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_registerButton:Landroid/widget/Button;

    iget-object v2, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->G:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 430
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_birthdayField:Landroid/widget/EditText;

    iget-object v2, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->H:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 431
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_profPic:Landroid/widget/ImageView;

    new-instance v2, Lkik/android/chat/fragment/pe;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/pe;-><init>(Lkik/android/chat/fragment/KikRegistrationFragment;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 440
    const v0, 0x7f0e0083

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_passwordField:Landroid/widget/EditText;

    .line 442
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_passwordField:Landroid/widget/EditText;

    sget-object v2, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setTypeface(Landroid/graphics/Typeface;)V

    .line 444
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_firstnameField:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 445
    const v0, 0x7f020234

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->q:Landroid/graphics/drawable/Drawable;

    .line 446
    const v0, 0x7f020233

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->r:Landroid/graphics/drawable/Drawable;

    .line 447
    const v0, 0x7f070080

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->s:Landroid/graphics/drawable/AnimationDrawable;

    .line 449
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_firstnameField:Landroid/widget/EditText;

    iget-object v3, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->J:Landroid/text/TextWatcher;

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 450
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_usernameField:Landroid/widget/EditText;

    iget-object v3, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->K:Landroid/text/TextWatcher;

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 451
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_usernameField:Landroid/widget/EditText;

    new-instance v3, Lkik/android/chat/fragment/pf;

    invoke-direct {v3, p0, v2}, Lkik/android/chat/fragment/pf;-><init>(Lkik/android/chat/fragment/KikRegistrationFragment;Landroid/content/res/Resources;)V

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 470
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_passwordField:Landroid/widget/EditText;

    new-instance v3, Lkik/android/chat/fragment/ol;

    invoke-direct {v3, p0, v2}, Lkik/android/chat/fragment/ol;-><init>(Lkik/android/chat/fragment/KikRegistrationFragment;Landroid/content/res/Resources;)V

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 495
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    new-instance v3, Lkik/android/chat/fragment/om;

    invoke-direct {v3, p0, v2}, Lkik/android/chat/fragment/om;-><init>(Lkik/android/chat/fragment/KikRegistrationFragment;Landroid/content/res/Resources;)V

    invoke-virtual {v0, v3}, Lkik/android/widget/KikAutoCompleteTextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 524
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 525
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/accounts/AccountManager;->getAccounts()[Landroid/accounts/Account;

    move-result-object v4

    .line 526
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 527
    array-length v6, v4

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v6, :cond_1

    aget-object v7, v4, v0

    .line 528
    iget-object v8, v7, Landroid/accounts/Account;->name:Ljava/lang/String;

    const v9, 0x7f0901e9

    invoke-virtual {v2, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_0

    iget-object v8, v7, Landroid/accounts/Account;->type:Ljava/lang/String;

    const-string v9, "MOTHER_USER_CREDS_TYPE"

    invoke-virtual {v8, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_0

    iget-object v8, v7, Landroid/accounts/Account;->name:Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v3, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 531
    iget-object v7, v7, Landroid/accounts/Account;->name:Ljava/lang/String;

    .line 532
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 527
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 537
    :cond_1
    new-instance v0, Lcom/kik/view/adapters/v;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-direct {v0, v3, v5}, Lcom/kik/view/adapters/v;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->x:Lcom/kik/view/adapters/v;

    .line 539
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    iget-object v3, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->x:Lcom/kik/view/adapters/v;

    invoke-virtual {v0, v3}, Lkik/android/widget/KikAutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 540
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lkik/android/widget/KikAutoCompleteTextView;->setThreshold(I)V

    .line 541
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    new-instance v3, Lkik/android/chat/fragment/on;

    invoke-direct {v3, p0}, Lkik/android/chat/fragment/on;-><init>(Lkik/android/chat/fragment/KikRegistrationFragment;)V

    invoke-virtual {v0, v3}, Lkik/android/widget/KikAutoCompleteTextView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 569
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->x:Lcom/kik/view/adapters/v;

    new-instance v3, Lkik/android/chat/fragment/op;

    invoke-direct {v3, p0}, Lkik/android/chat/fragment/op;-><init>(Lkik/android/chat/fragment/KikRegistrationFragment;)V

    invoke-virtual {v0, v3}, Lcom/kik/view/adapters/v;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 584
    const v0, 0x7f0e0068

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 586
    new-instance v3, Lkik/android/util/bg;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    invoke-direct {v3, v4}, Lkik/android/util/bg;-><init>(Landroid/content/Context;)V

    .line 587
    invoke-virtual {v3}, Lkik/android/util/bg;->a()Ljava/lang/String;

    move-result-object v3

    .line 588
    const v4, 0x7f090103

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v3, v5, v6

    invoke-virtual {v2, v4, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 591
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 592
    const/16 v2, 0xf

    invoke-static {v0, v2}, Landroid/text/util/Linkify;->addLinks(Landroid/widget/TextView;I)Z

    .line 593
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 595
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->f:Lkik/a/e/f;

    invoke-interface {v0}, Lkik/a/e/f;->o()V

    .line 598
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->i:Lkik/android/util/ar;

    const-string v2, "com.kik.android.registerSharedPrefs"

    invoke-interface {v0, v2}, Lkik/android/util/ar;->a(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 599
    iget-object v2, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_firstnameField:Landroid/widget/EditText;

    const-string v3, "firstNameRegister"

    const/4 v4, 0x0

    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 600
    iget-object v2, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_lastnameField:Landroid/widget/EditText;

    const-string v3, "lastNameRegister"

    const/4 v4, 0x0

    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 601
    iget-object v2, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_usernameField:Landroid/widget/EditText;

    const-string v3, "userNameRegister"

    const/4 v4, 0x0

    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 602
    iget-object v2, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    const-string v3, "emailRegister"

    const/4 v4, 0x0

    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lkik/android/widget/KikAutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V

    .line 603
    const-string v2, "birthdayRegister"

    invoke-interface {v0, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 604
    iget-object v2, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->z:Ljava/util/Calendar;

    const-string v3, "birthdayRegister"

    iget-object v4, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->B:Ljava/util/Date;

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-interface {v0, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 605
    invoke-direct {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->b()V

    .line 607
    :cond_2
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/util/p;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 608
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_profPic:Landroid/widget/ImageView;

    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v2

    invoke-virtual {v2}, Lkik/android/util/p;->d()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 611
    :cond_3
    return-object v1
.end method

.method public onDestroyView()V
    .locals 0

    .prologue
    .line 688
    invoke-super {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->onDestroyView()V

    .line 689
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikRegistrationFragment;->a()V

    .line 690
    invoke-static {p0}, Lbutterknife/ButterKnife;->reset(Ljava/lang/Object;)V

    .line 691
    return-void
.end method

.method public onPause()V
    .locals 4

    .prologue
    .line 671
    invoke-super {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->onPause()V

    .line 672
    iget-object v0, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->i:Lkik/android/util/ar;

    const-string v1, "com.kik.android.registerSharedPrefs"

    invoke-interface {v0, v1}, Lkik/android/util/ar;->a(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 673
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 674
    const-string v1, "firstNameRegister"

    iget-object v2, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_firstnameField:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 675
    const-string v1, "lastNameRegister"

    iget-object v2, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_lastnameField:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 676
    const-string v1, "userNameRegister"

    iget-object v2, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_usernameField:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 677
    const-string v1, "emailRegister"

    iget-object v2, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    invoke-virtual {v2}, Lkik/android/widget/KikAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 678
    iget-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->_birthdayField:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->z:Ljava/util/Calendar;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Landroid/text/format/DateUtils;->isToday(J)Z

    move-result v1

    if-nez v1, :cond_0

    .line 680
    const-string v1, "birthdayRegister"

    iget-object v2, p0, Lkik/android/chat/fragment/KikRegistrationFragment;->z:Ljava/util/Calendar;

    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 682
    :cond_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 683
    return-void
.end method
