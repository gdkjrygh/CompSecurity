.class public final Lcom/roidapp/cloudlib/sns/af;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Z

.field private static final b:Ljava/lang/String;

.field private static c:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 47
    const-string v0, "http://api.adr.pt.ksmobile.com/user/changeIp"

    sput-object v0, Lcom/roidapp/cloudlib/sns/af;->b:Ljava/lang/String;

    .line 95
    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/roidapp/cloudlib/sns/af;->c:J

    return-void
.end method

.method private static a(I)V
    .locals 2

    .prologue
    .line 286
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "snsLoginType"

    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 287
    return-void
.end method

.method public static a(Landroid/app/Activity;Lcom/roidapp/cloudlib/sns/aj;Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 98
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 99
    sget-wide v2, Lcom/roidapp/cloudlib/sns/af;->c:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x1f4

    cmp-long v2, v2, v4

    if-gez v2, :cond_0

    .line 147
    :goto_0
    return-void

    .line 101
    :cond_0
    sput-wide v0, Lcom/roidapp/cloudlib/sns/af;->c:J

    .line 102
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 103
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    .line 104
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 105
    new-instance v0, Lcom/roidapp/cloudlib/sns/ah;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/ah;-><init>()V

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 112
    invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V

    .line 113
    invoke-static {}, Lcom/roidapp/cloudlib/sns/f/a;->a()Lcom/roidapp/cloudlib/sns/f/a;

    move-result-object v0

    const/4 v2, 0x2

    invoke-virtual {v0, p2, v2}, Lcom/roidapp/cloudlib/sns/f/a;->a(Ljava/lang/String;I)V

    .line 115
    :try_start_0
    invoke-virtual {v1}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    sget v2, Lcom/roidapp/cloudlib/as;->S:I

    invoke-virtual {v0, v2}, Landroid/view/Window;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    new-instance v2, Lcom/roidapp/cloudlib/sns/ai;

    invoke-direct {v2, p0, p2, p1, v1}, Lcom/roidapp/cloudlib/sns/ai;-><init>(Landroid/app/Activity;Ljava/lang/String;Lcom/roidapp/cloudlib/sns/aj;Landroid/app/AlertDialog;)V

    .line 133
    sget v0, Lcom/roidapp/cloudlib/ar;->A:I

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 134
    sget v3, Lcom/roidapp/cloudlib/aq;->C:I

    invoke-static {v0, v3}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 135
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 137
    sget v0, Lcom/roidapp/cloudlib/ar;->y:I

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 138
    sget v3, Lcom/roidapp/cloudlib/aq;->A:I

    invoke-static {v0, v3}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 139
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 141
    sget v0, Lcom/roidapp/cloudlib/ar;->z:I

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 142
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v1

    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/roidapp/cloudlib/al;->e(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 143
    sget v1, Lcom/roidapp/cloudlib/aq;->B:I

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 144
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 117
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 118
    invoke-virtual {v1}, Landroid/app/AlertDialog;->dismiss()V

    goto :goto_0

    .line 146
    :cond_1
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0
.end method

.method public static a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 71
    sget-boolean v0, Lcom/roidapp/cloudlib/sns/af;->a:Z

    if-eqz v0, :cond_0

    .line 84
    :goto_0
    return-void

    .line 74
    :cond_0
    const/4 v0, 0x1

    sput-boolean v0, Lcom/roidapp/cloudlib/sns/af;->a:Z

    .line 75
    new-instance v0, Lcom/roidapp/cloudlib/sns/l;

    sget-object v1, Lcom/roidapp/cloudlib/sns/af;->b:Ljava/lang/String;

    new-instance v2, Lcom/roidapp/cloudlib/sns/ag;

    invoke-direct {v2}, Lcom/roidapp/cloudlib/sns/ag;-><init>()V

    invoke-direct {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/l;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/j;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/l;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public static a(Z)V
    .locals 2

    .prologue
    .line 62
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "whether_usa_area"

    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 64
    return-void
.end method

.method public static a()Z
    .locals 3

    .prologue
    .line 57
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "whether_usa_area"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static a(Landroid/app/Activity;Lcom/roidapp/cloudlib/sns/w;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/p;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 191
    invoke-static {}, Lcom/roidapp/cloudlib/sns/af;->b()I

    move-result v1

    .line 192
    const/4 v0, 0x0

    .line 193
    packed-switch v1, :pswitch_data_0

    .line 210
    :cond_0
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 211
    invoke-static {p0, v0, v1, p1}, Lcom/roidapp/cloudlib/sns/q;->a(Landroid/content/Context;Ljava/lang/String;ILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 214
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 196
    :pswitch_0
    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->b()Lcom/facebook/AccessToken;

    move-result-object v2

    .line 197
    if-eqz v2, :cond_0

    .line 198
    invoke-virtual {v2}, Lcom/facebook/AccessToken;->getToken()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 202
    :pswitch_1
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 206
    :pswitch_2
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->v(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 193
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static a(Landroid/app/Activity;Ljava/lang/String;I)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    const/16 v3, 0x33d9

    .line 157
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 182
    :cond_0
    :goto_0
    return v0

    .line 159
    :cond_1
    sget v2, Lcom/roidapp/cloudlib/ar;->y:I

    if-ne p2, v2, :cond_2

    .line 160
    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/af;->a(I)V

    .line 162
    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 163
    const-string v2, "page_name"

    invoke-virtual {v0, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 164
    invoke-virtual {p0, v0, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    :goto_1
    move v0, v1

    .line 182
    goto :goto_0

    .line 166
    :cond_2
    sget v2, Lcom/roidapp/cloudlib/ar;->A:I

    if-ne p2, v2, :cond_3

    .line 167
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(I)V

    .line 169
    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;

    invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 170
    const-string v2, "page_name"

    invoke-virtual {v0, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 171
    invoke-virtual {p0, v0, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_1

    .line 173
    :cond_3
    sget v2, Lcom/roidapp/cloudlib/ar;->z:I

    if-ne p2, v2, :cond_0

    .line 174
    const/4 v0, 0x3

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(I)V

    .line 176
    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;

    invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 177
    const-string v2, "page_name"

    invoke-virtual {v0, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 178
    invoke-virtual {p0, v0, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_1
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 1

    .prologue
    .line 92
    invoke-static {p0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->b()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/widget/EditText;)Z
    .locals 3

    .prologue
    .line 248
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/EditText;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 249
    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 250
    invoke-virtual {p0}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    move-result v0

    .line 252
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Lorg/json/JSONObject;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 244
    const-string v1, "code"

    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b()I
    .locals 3

    .prologue
    .line 290
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "snsLoginType"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static b(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 218
    invoke-static {p0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a()V

    .line 220
    invoke-static {}, Lcom/roidapp/cloudlib/sns/af;->b()I

    move-result v0

    .line 221
    packed-switch v0, :pswitch_data_0

    .line 235
    :goto_0
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "snsLoginType"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 236
    return-void

    .line 224
    :pswitch_0
    invoke-static {p0}, Lcom/roidapp/cloudlib/facebook/al;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 228
    :pswitch_1
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 232
    :pswitch_2
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->u(Landroid/content/Context;)V

    goto :goto_0

    .line 221
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static c(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 257
    if-eqz p0, :cond_0

    .line 258
    const-string v0, "input_method"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 259
    if-eqz v0, :cond_0

    .line 261
    :try_start_0
    const-class v1, Landroid/view/inputmethod/InputMethodManager;

    const-string v2, "mServedView"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 263
    if-eqz v1, :cond_0

    .line 265
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 266
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 267
    instance-of v2, v1, Landroid/view/View;

    if-eqz v2, :cond_0

    .line 268
    check-cast v1, Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 278
    :cond_0
    :goto_0
    return-void

    .line 274
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    goto :goto_0

    .line 275
    :catch_1
    move-exception v0

    goto :goto_0
.end method
