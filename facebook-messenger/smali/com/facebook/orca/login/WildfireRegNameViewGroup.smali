.class public Lcom/facebook/orca/login/WildfireRegNameViewGroup;
.super Lcom/facebook/auth/login/m;
.source "WildfireRegNameViewGroup.java"

# interfaces
.implements Lcom/facebook/orca/login/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/auth/login/m",
        "<",
        "Lcom/facebook/orca/login/e;",
        ">;",
        "Lcom/facebook/orca/login/d;"
    }
.end annotation


# static fields
.field public static final LOGO1_RESOURCE:Ljava/lang/String; = "orca:authparam:logo1"

.field public static final LOGO2_RESOURCE:Ljava/lang/String; = "orca:authparam:logo2"

.field private static final TAG:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final mAnalyticsLogger:Lcom/facebook/analytics/av;

.field private final mFirstNameErrorIcon:Landroid/graphics/drawable/Drawable;

.field private final mFirstNameText:Landroid/widget/EditText;

.field private final mInputMethodManager:Landroid/view/inputmethod/InputMethodManager;

.field private final mLastNameErrorIcon:Landroid/graphics/drawable/Drawable;

.field private final mLastNameText:Landroid/widget/EditText;

.field private final mLocaleProvider:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/util/Locale;",
            ">;"
        }
    .end annotation
.end field

.field private final mNameContainer:Landroid/view/ViewGroup;

.field private final mNamePrompt:Landroid/widget/TextView;

.field private final mNextButton:Landroid/widget/Button;

.field private final mProgressIndicator:Lcom/facebook/fbservice/ops/ab;

.field private final mWildfireAnalyticsUtils:Lcom/facebook/orca/login/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 47
    const-class v0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;

    sput-object v0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->TAG:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/orca/login/e;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 97
    invoke-direct {p0, p1, p2}, Lcom/facebook/auth/login/m;-><init>(Landroid/content/Context;Lcom/facebook/auth/login/c;)V

    .line 99
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->getInjector()Lcom/facebook/inject/t;

    move-result-object v1

    .line 100
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mAnalyticsLogger:Lcom/facebook/analytics/av;

    .line 101
    const-class v0, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mInputMethodManager:Landroid/view/inputmethod/InputMethodManager;

    .line 102
    const-class v0, Ljava/util/Locale;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mLocaleProvider:Ljavax/inject/a;

    .line 103
    const-class v0, Lcom/facebook/orca/login/b;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/login/b;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mWildfireAnalyticsUtils:Lcom/facebook/orca/login/b;

    .line 105
    sget v0, Lcom/facebook/k;->orca_wildfire_reg_name:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->setContentView(I)V

    .line 106
    sget v0, Lcom/facebook/i;->name_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mNameContainer:Landroid/view/ViewGroup;

    .line 107
    sget v0, Lcom/facebook/i;->name_prompt:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mNamePrompt:Landroid/widget/TextView;

    .line 108
    sget v0, Lcom/facebook/i;->first_name:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mFirstNameText:Landroid/widget/EditText;

    .line 109
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/h;->orca_field_error_icon:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mFirstNameErrorIcon:Landroid/graphics/drawable/Drawable;

    .line 110
    sget v0, Lcom/facebook/i;->last_name:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mLastNameText:Landroid/widget/EditText;

    .line 111
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/h;->orca_field_error_icon:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mLastNameErrorIcon:Landroid/graphics/drawable/Drawable;

    .line 113
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->updateNameViewOrder()V

    .line 114
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->prefillName()V

    .line 116
    sget v0, Lcom/facebook/i;->next:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mNextButton:Landroid/widget/Button;

    .line 117
    new-instance v0, Lcom/facebook/fbservice/ops/aa;

    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/facebook/o;->wildfire_reg_verification_progress:I

    invoke-direct {v0, v1, v2}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mProgressIndicator:Lcom/facebook/fbservice/ops/ab;

    .line 120
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mNextButton:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/orca/login/f;

    invoke-direct {v1, p0}, Lcom/facebook/orca/login/f;-><init>(Lcom/facebook/orca/login/WildfireRegNameViewGroup;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 127
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mLastNameText:Landroid/widget/EditText;

    new-instance v1, Lcom/facebook/orca/login/g;

    invoke-direct {v1, p0}, Lcom/facebook/orca/login/g;-><init>(Lcom/facebook/orca/login/WildfireRegNameViewGroup;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 143
    sget v0, Lcom/facebook/i;->name_logo1:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 144
    sget v1, Lcom/facebook/i;->name_logo2:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 145
    const-string v2, "orca:authparam:logo1"

    invoke-virtual {p0, v2, v4}, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->getResource(Ljava/lang/String;I)I

    move-result v2

    .line 146
    const-string v3, "orca:authparam:logo2"

    invoke-virtual {p0, v3, v4}, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->getResource(Ljava/lang/String;I)I

    move-result v3

    .line 148
    if-eqz v2, :cond_0

    .line 149
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 152
    :cond_0
    if-eqz v3, :cond_1

    .line 153
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 155
    :cond_1
    return-void
.end method

.method static synthetic access$000(Lcom/facebook/orca/login/WildfireRegNameViewGroup;)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->onNextClick()V

    return-void
.end method

.method public static createParameterBundle(II)Landroid/os/Bundle;
    .locals 2

    .prologue
    .line 76
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 77
    const-string v1, "orca:authparam:logo1"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 78
    const-string v1, "orca:authparam:logo2"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 79
    return-object v0
.end method

.method private getDrawableBoundsForEditText(Landroid/widget/EditText;Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 228
    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/widget/EditText;->getHeight()I

    move-result v1

    invoke-virtual {p1}, Landroid/widget/EditText;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p1}, Landroid/widget/EditText;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p1}, Landroid/widget/EditText;->getHeight()I

    move-result v2

    invoke-virtual {p1}, Landroid/widget/EditText;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p1}, Landroid/widget/EditText;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-direct {v0, v4, v4, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method private onNextClick()V
    .locals 5

    .prologue
    .line 158
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mFirstNameText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 159
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_1

    .line 169
    :cond_0
    :goto_0
    return-void

    .line 162
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mLastNameText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 163
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 167
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mInputMethodManager:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->getWindowToken()Landroid/os/IBinder;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 168
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->control:Lcom/facebook/auth/login/c;

    check-cast v0, Lcom/facebook/orca/login/e;

    invoke-interface {v0, v1, v2}, Lcom/facebook/orca/login/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private prefillName()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    const/4 v3, 0x0

    .line 176
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_4

    .line 178
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/ContactsContract$Profile;->CONTENT_URI:Landroid/net/Uri;

    new-array v2, v7, [Ljava/lang/String;

    const-string v4, "display_name_alt"

    aput-object v4, v2, v6

    move-object v4, v3

    move-object v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 186
    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-nez v1, :cond_1

    .line 187
    :cond_0
    sget-object v0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->TAG:Ljava/lang/Class;

    const-string v1, "Couldn\'t find user profile!"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 213
    :goto_0
    return-void

    .line 190
    :cond_1
    const-string v1, "display_name_alt"

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 192
    if-nez v0, :cond_2

    .line 193
    sget-object v0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->TAG:Ljava/lang/Class;

    const-string v1, "User\'s name was null!"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 196
    :cond_2
    sget-object v1, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->TAG:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Found user\'s name: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 198
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mAnalyticsLogger:Lcom/facebook/analytics/av;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mWildfireAnalyticsUtils:Lcom/facebook/orca/login/b;

    const-string v3, "prefill_user_name"

    invoke-virtual {v2, v3}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "name"

    invoke-virtual {v2, v3, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 203
    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 204
    array-length v1, v0

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    .line 205
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mFirstNameText:Landroid/widget/EditText;

    aget-object v2, v0, v7

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 206
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mLastNameText:Landroid/widget/EditText;

    aget-object v0, v0, v6

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 208
    :cond_3
    sget-object v0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->TAG:Ljava/lang/Class;

    const-string v1, "Couldn\'t split name into given/family."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 211
    :cond_4
    sget-object v0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->TAG:Ljava/lang/Class;

    const-string v1, "API does not support user profiles; cannot pre-fill user\'s name."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private updateNameViewOrder()V
    .locals 6

    .prologue
    const/4 v5, -0x1

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 276
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mNameContainer:Landroid/view/ViewGroup;

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mFirstNameText:Landroid/widget/EditText;

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v3

    .line 277
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mNameContainer:Landroid/view/ViewGroup;

    iget-object v4, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mLastNameText:Landroid/widget/EditText;

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v4

    .line 281
    if-eq v3, v5, :cond_0

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 282
    if-eq v4, v5, :cond_1

    move v0, v1

    :goto_1
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 283
    if-ge v3, v4, :cond_2

    :goto_2
    invoke-static {v1}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 285
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mLocaleProvider:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Locale;

    .line 286
    sget-object v1, Lcom/facebook/user/a/g;->a:Lcom/google/common/a/fi;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/common/a/fi;->contains(Ljava/lang/Object;)Z

    move-result v1

    .line 290
    if-nez v1, :cond_3

    .line 291
    sget-object v0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->TAG:Ljava/lang/Class;

    const-string v1, "Not reordering children, already matches default."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 300
    :goto_3
    return-void

    :cond_0
    move v0, v2

    .line 281
    goto :goto_0

    :cond_1
    move v0, v2

    .line 282
    goto :goto_1

    :cond_2
    move v1, v2

    .line 283
    goto :goto_2

    .line 295
    :cond_3
    sget-object v1, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->TAG:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Swapping first and last name to match locale: "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 296
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mNameContainer:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mFirstNameText:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 297
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mNameContainer:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mLastNameText:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 298
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mNameContainer:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mLastNameText:Landroid/widget/EditText;

    invoke-virtual {v0, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 299
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mNameContainer:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mFirstNameText:Landroid/widget/EditText;

    invoke-virtual {v0, v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    goto :goto_3
.end method


# virtual methods
.method public beginShowingProgress()V
    .locals 1

    .prologue
    .line 265
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mProgressIndicator:Lcom/facebook/fbservice/ops/ab;

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/ab;->a()V

    .line 266
    return-void
.end method

.method public hideFirstNameError()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 245
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mFirstNameText:Landroid/widget/EditText;

    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/widget/EditText;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 247
    return-void
.end method

.method public hideLastNameError()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 259
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mLastNameText:Landroid/widget/EditText;

    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/widget/EditText;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 261
    return-void
.end method

.method public setNamePrompt(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 217
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mNamePrompt:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 218
    return-void
.end method

.method public setNamePromptResource(I)V
    .locals 1

    .prologue
    .line 222
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mNamePrompt:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 223
    return-void
.end method

.method public showFirstNameError()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 237
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mFirstNameErrorIcon:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mFirstNameText:Landroid/widget/EditText;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mFirstNameErrorIcon:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, v1, v2}, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->getDrawableBoundsForEditText(Landroid/widget/EditText;Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 239
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mFirstNameText:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mFirstNameErrorIcon:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v3, v3, v1, v3}, Landroid/widget/EditText;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 241
    return-void
.end method

.method public showLastNameError()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 251
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mLastNameErrorIcon:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mLastNameText:Landroid/widget/EditText;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mLastNameErrorIcon:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, v1, v2}, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->getDrawableBoundsForEditText(Landroid/widget/EditText;Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 253
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mLastNameText:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mLastNameErrorIcon:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v3, v3, v1, v3}, Landroid/widget/EditText;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 255
    return-void
.end method

.method public stopShowingProgress()V
    .locals 1

    .prologue
    .line 270
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegNameViewGroup;->mProgressIndicator:Lcom/facebook/fbservice/ops/ab;

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/ab;->b()V

    .line 271
    return-void
.end method
