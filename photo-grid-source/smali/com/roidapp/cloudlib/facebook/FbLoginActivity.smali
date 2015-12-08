.class public Lcom/roidapp/cloudlib/facebook/FbLoginActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:[Ljava/lang/String;

.field public static final c:[Ljava/lang/String;

.field public static final d:[Ljava/lang/String;

.field public static final e:[Ljava/lang/String;


# instance fields
.field private f:Lcom/facebook/CallbackManager;

.field private g:Landroid/app/ProgressDialog;

.field private h:Lcom/facebook/GraphRequestAsyncTask;

.field private i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 60
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "user_photos"

    aput-object v1, v0, v2

    const-string v1, "user_friends"

    aput-object v1, v0, v3

    const-string v1, "email"

    aput-object v1, v0, v4

    sput-object v0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->a:[Ljava/lang/String;

    .line 61
    new-array v0, v3, [Ljava/lang/String;

    const-string v1, "publish_actions"

    aput-object v1, v0, v2

    sput-object v0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->b:[Ljava/lang/String;

    .line 63
    new-array v0, v3, [Ljava/lang/String;

    const-string v1, "publish_actions"

    aput-object v1, v0, v2

    sput-object v0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->c:[Ljava/lang/String;

    .line 64
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "publish_actions"

    aput-object v1, v0, v2

    const-string v1, "manage_pages"

    aput-object v1, v0, v3

    sput-object v0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->d:[Ljava/lang/String;

    .line 65
    new-array v0, v3, [Ljava/lang/String;

    const-string v1, "read_stream"

    aput-object v1, v0, v2

    sput-object v0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->e:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 241
    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    .line 204
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->h:Lcom/facebook/GraphRequestAsyncTask;

    if-eqz v0, :cond_0

    .line 205
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->h:Lcom/facebook/GraphRequestAsyncTask;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/GraphRequestAsyncTask;->cancel(Z)Z

    .line 206
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->h:Lcom/facebook/GraphRequestAsyncTask;

    .line 208
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/facebook/FbLoginActivity;Ljava/lang/Exception;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 2169
    if-eqz p1, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->i:Z

    if-eqz v0, :cond_0

    .line 2170
    instance-of v0, p1, Lcom/facebook/FacebookOperationCanceledException;

    if-nez v0, :cond_0

    .line 2171
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget v1, Lcom/roidapp/cloudlib/at;->h:I

    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 2175
    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 2176
    const-string v1, "is_error"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 2177
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->setResult(ILandroid/content/Intent;)V

    .line 2178
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->finish()V

    .line 55
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/facebook/FbLoginActivity;)Z
    .locals 1

    .prologue
    .line 55
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->i:Z

    return v0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/facebook/FbLoginActivity;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 55
    .line 1211
    sget v0, Lcom/roidapp/cloudlib/at;->Y:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/cloudlib/common/d;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->g:Landroid/app/ProgressDialog;

    .line 1212
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->g:Landroid/app/ProgressDialog;

    invoke-virtual {v0, v2}, Landroid/app/ProgressDialog;->setCanceledOnTouchOutside(Z)V

    .line 1213
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->g:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 1215
    invoke-direct {p0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->a()V

    .line 1220
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v0

    new-instance v1, Lcom/roidapp/cloudlib/facebook/ae;

    invoke-direct {v1, p0, v2}, Lcom/roidapp/cloudlib/facebook/ae;-><init>(Lcom/roidapp/cloudlib/facebook/FbLoginActivity;B)V

    invoke-static {v0, v1}, Lcom/facebook/GraphRequest;->newMeRequest(Lcom/facebook/AccessToken;Lcom/facebook/GraphRequest$GraphJSONObjectCallback;)Lcom/facebook/GraphRequest;

    move-result-object v0

    .line 1238
    invoke-virtual {v0}, Lcom/facebook/GraphRequest;->executeAsync()Lcom/facebook/GraphRequestAsyncTask;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->h:Lcom/facebook/GraphRequestAsyncTask;

    .line 55
    return-void
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/facebook/FbLoginActivity;)Landroid/app/ProgressDialog;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->g:Landroid/app/ProgressDialog;

    return-object v0
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .prologue
    .line 183
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 184
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->setResult(I)V

    .line 185
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->finish()V

    .line 190
    :goto_0
    return-void

    .line 188
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->f:Lcom/facebook/CallbackManager;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->f:Lcom/facebook/CallbackManager;

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/CallbackManager;->onActivityResult(IILandroid/content/Intent;)Z

    .line 189
    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 73
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 75
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->requestWindowFeature(I)Z

    .line 76
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "permission"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 77
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "need_load_user_info"

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->i:Z

    .line 79
    sget v0, Lcom/roidapp/cloudlib/as;->an:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->setContentView(I)V

    .line 81
    invoke-static {p0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 82
    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->b()Lcom/facebook/AccessToken;

    move-result-object v0

    .line 83
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/AccessToken;->isExpired()Z

    move-result v0

    if-nez v0, :cond_0

    .line 87
    const/4 v0, -0x1

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->setResult(ILandroid/content/Intent;)V

    .line 88
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->finish()V

    .line 126
    :goto_0
    return-void

    .line 1130
    :cond_0
    if-eqz v1, :cond_1

    .line 1131
    new-instance v0, Ljava/util/ArrayList;

    sget-object v2, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->a:[Ljava/lang/String;

    array-length v2, v2

    add-int/lit8 v2, v2, 0x1

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1132
    sget-object v2, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->a:[Ljava/lang/String;

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1133
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1138
    :goto_1
    invoke-static {}, Lcom/facebook/CallbackManager$Factory;->create()Lcom/facebook/CallbackManager;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->f:Lcom/facebook/CallbackManager;

    .line 1139
    invoke-static {}, Lcom/facebook/login/LoginManager;->getInstance()Lcom/facebook/login/LoginManager;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->f:Lcom/facebook/CallbackManager;

    new-instance v3, Lcom/roidapp/cloudlib/facebook/ad;

    invoke-direct {v3, p0}, Lcom/roidapp/cloudlib/facebook/ad;-><init>(Lcom/roidapp/cloudlib/facebook/FbLoginActivity;)V

    invoke-virtual {v1, v2, v3}, Lcom/facebook/login/LoginManager;->registerCallback(Lcom/facebook/CallbackManager;Lcom/facebook/FacebookCallback;)V

    .line 1165
    invoke-static {}, Lcom/facebook/login/LoginManager;->getInstance()Lcom/facebook/login/LoginManager;

    move-result-object v1

    invoke-virtual {v1, p0, v0}, Lcom/facebook/login/LoginManager;->logInWithReadPermissions(Landroid/app/Activity;Ljava/util/Collection;)V

    goto :goto_0

    .line 1136
    :cond_1
    sget-object v0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->a:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    .line 95
    :cond_2
    new-instance v0, Lcom/roidapp/cloudlib/facebook/aa;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/facebook/aa;-><init>(Lcom/roidapp/cloudlib/facebook/FbLoginActivity;)V

    new-instance v1, Lcom/roidapp/cloudlib/facebook/ab;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/facebook/ab;-><init>(Lcom/roidapp/cloudlib/facebook/FbLoginActivity;)V

    new-instance v2, Lcom/roidapp/cloudlib/facebook/ac;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/facebook/ac;-><init>(Lcom/roidapp/cloudlib/facebook/FbLoginActivity;)V

    invoke-static {p0, v0, v1, v2}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnKeyListener;)V

    goto :goto_0
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 193
    invoke-direct {p0}, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->a()V

    .line 194
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->g:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    .line 195
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->g:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 196
    iput-object v1, p0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->g:Landroid/app/ProgressDialog;

    .line 198
    :cond_0
    iput-object v1, p0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->f:Lcom/facebook/CallbackManager;

    .line 200
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 201
    return-void
.end method
