.class public Lcom/roidapp/photogrid/cloud/BaseShareActivity;
.super Lcom/roidapp/photogrid/release/ParentActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/roidapp/cloudlib/template/b/a;
.implements Lcom/roidapp/photogrid/cloud/a/t;


# static fields
.field public static a:I

.field public static b:I

.field public static c:I

.field static final d:[Lcom/roidapp/photogrid/cloud/p;


# instance fields
.field private A:Ljava/lang/String;

.field private B:Z

.field private C:[I

.field private D:Ljava/lang/String;

.field private E:Z

.field private F:J

.field private G:I

.field private H:Z

.field private I:Lcom/roidapp/photogrid/cloud/a/q;

.field private J:Landroid/widget/RelativeLayout;

.field private K:Landroid/widget/TextView;

.field private L:Landroid/widget/RelativeLayout;

.field private M:Landroid/widget/ListView;

.field private N:Lcom/roidapp/photogrid/cloud/ch;

.field private O:Lcom/roidapp/cloudlib/upload/x;

.field private P:Lcom/roidapp/cloudlib/template/b/c;

.field private Q:Lcom/roidapp/cloudlib/template/TemplateInfo;

.field e:Landroid/view/View;

.field f:Ljava/lang/String;

.field g:Ljava/lang/String;

.field h:Ljava/lang/String;

.field i:Ljava/lang/String;

.field j:Z

.field k:I

.field l:Ljava/lang/String;

.field m:Ljava/lang/String;

.field n:Ljava/lang/String;

.field o:I

.field public p:Z

.field public q:Z

.field private r:Lcom/roidapp/photogrid/cloud/o;

.field private s:Landroid/widget/ImageView;

.field private y:Lcom/roidapp/photogrid/cloud/r;

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 192
    sput v5, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a:I

    .line 193
    sput v6, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->b:I

    .line 194
    sput v7, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->c:I

    .line 220
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/roidapp/photogrid/cloud/p;

    new-instance v1, Lcom/roidapp/photogrid/cloud/p;

    const v2, 0x7f02016a

    const-string v3, "Line"

    const-string v4, "jp.naver.line.android"

    invoke-direct {v1, v2, v3, v4}, Lcom/roidapp/photogrid/cloud/p;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v5

    new-instance v1, Lcom/roidapp/photogrid/cloud/p;

    const v2, 0x7f020195

    const-string v3, "Wechat"

    const-string v4, "com.tencent.mm"

    invoke-direct {v1, v2, v3, v4}, Lcom/roidapp/photogrid/cloud/p;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v6

    new-instance v1, Lcom/roidapp/photogrid/cloud/p;

    const v2, 0x7f020182

    const-string v3, "Skype"

    const-string v4, "com.skype.raider"

    invoke-direct {v1, v2, v3, v4}, Lcom/roidapp/photogrid/cloud/p;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v7

    const/4 v1, 0x3

    new-instance v2, Lcom/roidapp/photogrid/cloud/p;

    const v3, 0x7f02018a

    const-string v4, "Telegram"

    const-string v5, "org.telegram.messenger"

    invoke-direct {v2, v3, v4, v5}, Lcom/roidapp/photogrid/cloud/p;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    sput-object v0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->d:[Lcom/roidapp/photogrid/cloud/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 111
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ParentActivity;-><init>()V

    .line 254
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->l:Ljava/lang/String;

    .line 257
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->H:Z

    .line 260
    sget v0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a:I

    iput v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->o:I

    .line 2019
    return-void
.end method

.method public static a(JZ)I
    .locals 2

    .prologue
    .line 187
    if-nez p2, :cond_0

    const-wide/16 v0, 0x7530

    cmp-long v0, p0, v0

    if-lez v0, :cond_0

    .line 188
    sget v0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->b:I

    .line 189
    :goto_0
    return v0

    :cond_0
    sget v0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a:I

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->J:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/BaseShareActivity;Lcom/roidapp/cloudlib/template/TemplateInfo;)V
    .locals 4

    .prologue
    .line 6306
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/template/j;->b(J)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    .line 6308
    :cond_1
    invoke-virtual {p1}, Lcom/roidapp/cloudlib/template/TemplateInfo;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/template/b/h;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 6311
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->Q:Lcom/roidapp/cloudlib/template/TemplateInfo;

    .line 6314
    const-string v0, "share"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "lastUnlockDialogTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 6316
    new-instance v0, Lcom/roidapp/cloudlib/template/b/c;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/template/b/c;-><init>(Lcom/roidapp/cloudlib/template/b/a;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->P:Lcom/roidapp/cloudlib/template/b/c;

    .line 6319
    new-instance v0, Lcom/roidapp/cloudlib/template/c/i;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/template/c/i;-><init>()V

    .line 6320
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->Q:Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/template/c/i;->a(Lcom/roidapp/cloudlib/template/TemplateInfo;)V

    .line 6321
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/template/c/i;->a(I)V

    .line 6322
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    const-string v2, "unlockTemplate"

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/template/c/i;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    .line 6324
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    const-string v1, "/Template/Unlock/Show/Share"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/BaseShareActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 111
    invoke-direct {p0, p1, p2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/BaseShareActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 111
    invoke-direct {p0, p1, p2, p3}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1198
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/o;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/o;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1201
    new-instance v0, Lcom/roidapp/photogrid/cloud/l;

    invoke-direct {v0}, Lcom/roidapp/photogrid/cloud/l;-><init>()V

    .line 1202
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 1203
    const-string v2, "path"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1204
    const-string v2, "mime"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1205
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/l;->setArguments(Landroid/os/Bundle;)V

    .line 1206
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    const-class v2, Lcom/roidapp/photogrid/cloud/l;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lcom/roidapp/baselib/c/n;->a(Landroid/support/v4/app/FragmentManager;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)Z

    .line 1210
    :goto_0
    return-void

    .line 1209
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/o;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1213
    if-nez p1, :cond_0

    .line 1214
    const v0, 0x7f07022b

    invoke-static {p0, v0}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    .line 1215
    const v0, 0x8800

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->setResult(I)V

    .line 1216
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->finish()V

    .line 1238
    :goto_0
    return-void

    .line 1220
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Instagram"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 1221
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 1222
    const-string v0, "SendInstagram"

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 1225
    :cond_1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SEND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1226
    const-string v1, "com.instagram.android"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1227
    const-string v1, "android.intent.extra.STREAM"

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1228
    const-string v1, "android.intent.extra.TEXT"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1229
    invoke-virtual {v0, p2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 1232
    const/high16 v1, 0x14000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1234
    const v1, 0xacd1

    :try_start_0
    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1238
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 6

    .prologue
    const-wide/16 v4, 0x1

    .line 1098
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1123
    :cond_0
    :goto_0
    return-void

    .line 1101
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 1102
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 1103
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Send"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 1105
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "share_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/a/q;->a(Ljava/lang/String;)V

    .line 1106
    :cond_3
    const-string v1, "SNS"

    const-string v2, "share_click"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/o;->f()Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "Save/Share/"

    :goto_1
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v1, v2, v0}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1107
    const-string v1, "SNS"

    const-string v2, "share_click"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/o;->f()Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "Save/Share/"

    :goto_2
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {p0, v1, v2, v0, v3}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 1109
    new-instance v1, Landroid/content/Intent;

    const-string v0, "android.intent.action.SEND"

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1110
    invoke-virtual {v1, p2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1111
    if-eqz p3, :cond_4

    .line 1112
    const-string v2, "android.intent.extra.SUBJECT"

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->A:Ljava/lang/String;

    if-nez v0, :cond_7

    const-string v0, ""

    :goto_3
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1113
    const-string v0, "android.intent.extra.TEXT"

    const v2, 0x7f0702be

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1115
    :cond_4
    const-string v0, "android.intent.extra.STREAM"

    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1116
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->h:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 1117
    const/high16 v0, 0x4000000

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1119
    const v0, 0xacd1

    :try_start_0
    invoke-virtual {p0, v1, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 1121
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/content/ActivityNotFoundException;->printStackTrace()V

    goto/16 :goto_0

    .line 1106
    :cond_5
    const-string v0, "Save/Save/"

    goto/16 :goto_1

    .line 1107
    :cond_6
    const-string v0, "Save/Save/"

    goto :goto_2

    .line 1112
    :cond_7
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->A:Ljava/lang/String;

    goto :goto_3
.end method

.method static a(Landroid/app/Activity;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZI)Z
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 167
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 168
    const-string v1, "image_path"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 169
    const-string v1, "thumbPath"

    invoke-virtual {v0, v1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 170
    const-string v1, "format"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 171
    const-string v1, "textTitle"

    invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 172
    const-string v1, "textContent"

    invoke-virtual {v0, v1, p6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 173
    const-string v1, "mode"

    invoke-virtual {v0, v1, p7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 174
    const-string v1, "gaParams"

    invoke-virtual {v0, v1, p8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 175
    const-string v1, "isfromfilter"

    invoke-virtual {v0, v1, p9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 176
    const-string v1, "isShare"

    invoke-virtual {v0, v1, p10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 177
    const-string v1, "share_restrict"

    invoke-virtual {v0, v1, p11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 179
    instance-of v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;

    if-eqz v1, :cond_0

    .line 180
    const-string v1, "hideOptions"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 182
    :cond_0
    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 183
    return v2
.end method

.method private a(Landroid/content/Intent;)Z
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 677
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->v:Z

    if-eqz v0, :cond_0

    move v0, v1

    .line 714
    :goto_0
    return v0

    .line 679
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->g:Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->h:Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    .line 680
    if-eqz p1, :cond_1

    .line 681
    const-string v0, "image_path"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    .line 682
    const-string v0, "thumbPath"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->g:Ljava/lang/String;

    .line 683
    const-string v0, "textTitle"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->A:Ljava/lang/String;

    .line 684
    const-string v0, "textContent"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->i:Ljava/lang/String;

    .line 685
    const-string v0, "hideOptions"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->B:Z

    .line 686
    const-string v0, "format"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->z:I

    .line 687
    const-string v0, "mode"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->m:Ljava/lang/String;

    .line 688
    const-string v0, "gaParams"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->n:Ljava/lang/String;

    .line 689
    const-string v0, "isfromfilter"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->H:Z

    .line 690
    const-string v0, "isShare"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    .line 691
    if-eqz v0, :cond_2

    .line 692
    invoke-static {}, Lcom/roidapp/cloudlib/sns/f/a;->a()Lcom/roidapp/cloudlib/sns/f/a;

    move-result-object v3

    const-string v4, "Share_Finish_Page"

    invoke-virtual {v3, v4, v2}, Lcom/roidapp/cloudlib/sns/f/a;->a(Ljava/lang/String;I)V

    .line 696
    :goto_1
    if-eqz v0, :cond_3

    new-instance v0, Lcom/roidapp/photogrid/cloud/br;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/br;-><init>(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)V

    :goto_2
    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    .line 697
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->n:Ljava/lang/String;

    if-nez v0, :cond_4

    const-string v0, ""

    :goto_3
    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->n:Ljava/lang/String;

    .line 698
    const-string v0, "share_restrict"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->o:I

    .line 699
    iput-boolean v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->j:Z

    .line 700
    iget v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->z:I

    sparse-switch v0, :sswitch_data_0

    .line 705
    const-string v0, "image/jpeg"

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->h:Ljava/lang/String;

    .line 712
    :goto_4
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->m:Ljava/lang/String;

    invoke-interface {v0, v3}, Lcom/roidapp/photogrid/cloud/o;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->l:Ljava/lang/String;

    .line 714
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->h:Ljava/lang/String;

    if-eqz v0, :cond_5

    move v0, v2

    goto/16 :goto_0

    .line 694
    :cond_2
    invoke-static {}, Lcom/roidapp/cloudlib/sns/f/a;->a()Lcom/roidapp/cloudlib/sns/f/a;

    move-result-object v3

    const-string v4, "Save_Finish_Page"

    invoke-virtual {v3, v4, v2}, Lcom/roidapp/cloudlib/sns/f/a;->a(Ljava/lang/String;I)V

    goto :goto_1

    .line 696
    :cond_3
    new-instance v0, Lcom/roidapp/photogrid/cloud/bf;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/bf;-><init>(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)V

    goto :goto_2

    .line 697
    :cond_4
    const-string v0, "/"

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->n:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    .line 702
    :sswitch_0
    const-string v0, "image/png"

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->h:Ljava/lang/String;

    goto :goto_4

    .line 708
    :sswitch_1
    const-string v0, "video/mp4"

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->h:Ljava/lang/String;

    .line 709
    iput-boolean v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->j:Z

    goto :goto_4

    :cond_5
    move v0, v1

    .line 714
    goto/16 :goto_0

    .line 700
    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0xa -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic b(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)Lcom/roidapp/photogrid/cloud/o;
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)Z
    .locals 1

    .prologue
    .line 111
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->E:Z

    return v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->s:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)Lcom/roidapp/photogrid/cloud/a/q;
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)V
    .locals 9

    .prologue
    const/4 v8, 0x1

    const v5, 0xcc03

    const/4 v6, 0x0

    .line 111
    .line 7256
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->C:[I

    if-nez v0, :cond_0

    .line 7257
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    invoke-static {v0}, Lcom/roidapp/imagelib/b/d;->a(Ljava/lang/String;)[I

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->C:[I

    .line 7259
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->C:[I

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->C:[I

    array-length v0, v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_4

    .line 7261
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->e:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 7262
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->e:Landroid/view/View;

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 7265
    :cond_1
    invoke-static {p0}, Lcom/roidapp/photogrid/release/ap;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 7266
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 7267
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->D:Ljava/lang/String;

    if-eqz v1, :cond_2

    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->D:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_7

    .line 7268
    :cond_2
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_3

    .line 7269
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_3

    .line 7270
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-ne v0, v1, :cond_3

    .line 7271
    new-instance v0, Lcom/roidapp/photogrid/common/ae;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lcom/roidapp/photogrid/common/ae;-><init>(Landroid/content/ContentResolver;Ljava/io/File;)V

    .line 7273
    :try_start_0
    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/ae;->a()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7285
    :cond_3
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 7287
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PhotoGrid_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->z:I

    if-ne v0, v8, :cond_5

    const-string v0, ".png"

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->D:Ljava/lang/String;

    .line 7288
    new-instance v7, Ljava/lang/Thread;

    new-instance v0, Lcom/roidapp/photogrid/cloud/m;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->y:Lcom/roidapp/photogrid/cloud/r;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->D:Ljava/lang/String;

    iget-object v5, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->C:[I

    aget v5, v5, v6

    iget-object v6, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->C:[I

    aget v6, v6, v8

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/cloud/m;-><init>(Lcom/roidapp/photogrid/cloud/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-direct {v7, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v7}, Ljava/lang/Thread;->start()V

    .line 7290
    :cond_4
    :goto_1
    return-void

    .line 7275
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 7276
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->y:Lcom/roidapp/photogrid/cloud/r;

    iget v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->z:I

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    invoke-virtual {v0, v5, v1, v6, v2}, Lcom/roidapp/photogrid/cloud/r;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_1

    .line 7287
    :cond_5
    const-string v0, ".jpg"

    goto :goto_0

    .line 7290
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->y:Lcom/roidapp/photogrid/cloud/r;

    iget v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->z:I

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    invoke-virtual {v0, v5, v1, v6, v2}, Lcom/roidapp/photogrid/cloud/r;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_1

    .line 7293
    :cond_7
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->y:Lcom/roidapp/photogrid/cloud/r;

    iget v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->z:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "/"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->D:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v5, v2, v6, v0}, Lcom/roidapp/photogrid/cloud/r;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_1
.end method

.method private n()Z
    .locals 6

    .prologue
    .line 1014
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 1015
    iget-wide v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->F:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x3e8

    cmp-long v2, v2, v4

    if-gez v2, :cond_0

    .line 1016
    const/4 v0, 0x1

    .line 1020
    :goto_0
    return v0

    .line 1019
    :cond_0
    iput-wide v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->F:J

    .line 1020
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Landroid/support/v4/app/FragmentActivity;
    .locals 0

    .prologue
    .line 1329
    return-object p0
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 544
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->M:Landroid/widget/ListView;

    if-eqz v0, :cond_0

    .line 545
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->M:Landroid/widget/ListView;

    const/16 v1, 0xc8

    invoke-virtual {v0, p1, v1}, Landroid/widget/ListView;->smoothScrollBy(II)V

    .line 546
    :cond_0
    return-void
.end method

.method public final a(Lcom/roidapp/cloudlib/template/TemplateInfo;)V
    .locals 0

    .prologue
    .line 1410
    return-void
.end method

.method public final a(Lcom/roidapp/cloudlib/template/d;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1355
    const v0, 0x8809

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->setResult(I)V

    .line 1356
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->finish()V

    .line 5413
    invoke-static {p1}, Lcom/roidapp/photogrid/common/bd;->a(Lcom/roidapp/cloudlib/template/d;)V

    .line 5414
    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->c()V

    .line 5415
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 5416
    const-string v1, "isFromTemplate"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 5417
    const-string v1, "FaceClip"

    invoke-virtual {p0, v1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 5418
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "needFaceClip"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 5419
    const-class v1, Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 5420
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1358
    return-void
.end method

.method public final a(Lcom/roidapp/photogrid/cloud/a/l;)V
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1916
    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->isFinishing()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 2017
    :cond_0
    :goto_0
    return-void

    .line 1918
    :cond_1
    invoke-virtual {p1}, Lcom/roidapp/photogrid/cloud/a/l;->d()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    .line 2007
    :sswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    if-eqz v0, :cond_0

    instance-of v0, p1, Lcom/roidapp/photogrid/cloud/a/a;

    if-eqz v0, :cond_0

    .line 2008
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v0, "adCard"

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/cloud/a/a;

    iget v0, v0, Lcom/roidapp/photogrid/cloud/a/a;->a:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    check-cast p1, Lcom/roidapp/photogrid/cloud/a/a;

    iget v2, p1, Lcom/roidapp/photogrid/cloud/a/a;->b:I

    invoke-virtual {v1, v0, v2}, Lcom/roidapp/photogrid/cloud/a/q;->a(Ljava/lang/String;I)V

    goto :goto_0

    .line 1920
    :sswitch_1
    invoke-static {p0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1921
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1922
    const-string v1, "image_path"

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1923
    const-string v1, "mode_str"

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->m:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1924
    const-string v1, "is_video"

    iget-boolean v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->j:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1925
    const v1, 0xacd3

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    .line 1927
    :cond_2
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->q:Z

    if-nez v0, :cond_0

    .line 1928
    new-instance v0, Lcom/roidapp/photogrid/cloud/k;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/k;-><init>(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)V

    const-string v1, "Save_Finish_Page"

    invoke-static {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/app/Activity;Lcom/roidapp/cloudlib/sns/aj;Ljava/lang/String;)V

    goto :goto_0

    .line 1940
    :sswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    if-eqz v0, :cond_3

    .line 1941
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    const-string v2, "home"

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/cloud/a/q;->a(Ljava/lang/String;)V

    .line 1942
    :cond_3
    sput-boolean v1, Lcom/roidapp/photogrid/common/az;->s:Z

    .line 1943
    const-string v0, "MainPage_View"

    const-string v1, "Share_Home"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1944
    const v0, 0x8803

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->setResult(I)V

    .line 1945
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->finish()V

    goto/16 :goto_0

    .line 1949
    :sswitch_3
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    if-eqz v2, :cond_0

    .line 1950
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "lastClickCardID"

    invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1951
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "weiduoneIsFilter"

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    iget-boolean v4, v4, Lcom/roidapp/photogrid/cloud/a/q;->b:Z

    if-nez v4, :cond_6

    :goto_1
    invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1952
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 1953
    const-string v1, "isUseRetouch"

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    iget-boolean v2, v2, Lcom/roidapp/photogrid/cloud/a/q;->c:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1954
    const-string v1, "isUseFilter"

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    iget-boolean v2, v2, Lcom/roidapp/photogrid/cloud/a/q;->b:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1955
    const v1, 0x8808

    invoke-virtual {p0, v1, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->setResult(ILandroid/content/Intent;)V

    .line 1956
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->finish()V

    .line 1959
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    if-eqz v0, :cond_0

    .line 1960
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_7

    .line 1961
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/cloud/a/q;->b:Z

    if-eqz v0, :cond_4

    .line 1962
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    const-string v1, "Retouch"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/a/q;->a(Ljava/lang/String;)V

    .line 1964
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/cloud/a/q;->c:Z

    if-eqz v0, :cond_5

    .line 1965
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    const-string v1, "Filter"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/a/q;->a(Ljava/lang/String;)V

    .line 1967
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/cloud/a/q;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/cloud/a/q;->c:Z

    if-nez v0, :cond_0

    .line 1968
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    const-string v1, "Filter"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/a/q;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_6
    move v0, v1

    .line 1951
    goto :goto_1

    .line 1972
    :cond_7
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v0, :cond_0

    .line 1973
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    const-string v1, "Template"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/a/q;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1981
    :sswitch_4
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "lastClickCardID"

    const/4 v2, 0x2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1982
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    if-eqz v0, :cond_0

    .line 1983
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    const-string v1, "Sticker"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/a/q;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1987
    :sswitch_5
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "lastClickCardID"

    const/4 v2, 0x3

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1988
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 1989
    const-string v1, "swich_mode"

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    iget v2, v2, Lcom/roidapp/photogrid/cloud/a/q;->a:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1990
    const v1, 0x8807

    invoke-virtual {p0, v1, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->setResult(ILandroid/content/Intent;)V

    .line 1991
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->finish()V

    .line 1992
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    if-eqz v0, :cond_0

    .line 1993
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    const-string v1, "mode"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/a/q;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1997
    :sswitch_6
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    if-eqz v0, :cond_0

    .line 1998
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    const-string v1, "CMBackup"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/a/q;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 2002
    :sswitch_7
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    if-eqz v0, :cond_0

    .line 2003
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    const-string v1, "followUS"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/a/q;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 2011
    :sswitch_8
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    if-eqz v0, :cond_0

    .line 2012
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    const-string v1, "FBInvite"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/a/q;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1918
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_3
        0x2 -> :sswitch_4
        0x3 -> :sswitch_5
        0x4 -> :sswitch_6
        0x5 -> :sswitch_2
        0x6 -> :sswitch_7
        0x8 -> :sswitch_8
        0xbcd2 -> :sswitch_1
    .end sparse-switch
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1397
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 549
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->J:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 550
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->K:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 551
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->J:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/roidapp/photogrid/cloud/e;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/cloud/e;-><init>(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/RelativeLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 557
    return-void
.end method

.method public final a(Ljava/lang/String;I)V
    .locals 5

    .prologue
    const v4, 0x7f0d00d7

    const/4 v3, 0x0

    .line 648
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    .line 649
    invoke-virtual {v1, v4}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 650
    if-eqz v0, :cond_0

    instance-of v2, v0, Lcom/roidapp/cloudlib/upload/x;

    if-nez v2, :cond_2

    .line 651
    :cond_0
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 652
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->O:Lcom/roidapp/cloudlib/upload/x;

    if-nez v1, :cond_1

    .line 653
    new-instance v1, Lcom/roidapp/cloudlib/upload/x;

    invoke-direct {v1}, Lcom/roidapp/cloudlib/upload/x;-><init>()V

    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->O:Lcom/roidapp/cloudlib/upload/x;

    .line 655
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->O:Lcom/roidapp/cloudlib/upload/x;

    invoke-virtual {v1, p2}, Lcom/roidapp/cloudlib/upload/x;->a(I)V

    .line 656
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->O:Lcom/roidapp/cloudlib/upload/x;

    new-instance v2, Lcom/roidapp/photogrid/cloud/g;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/cloud/g;-><init>(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)V

    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/upload/x;->a(Lcom/roidapp/cloudlib/upload/ab;)V

    .line 667
    const/high16 v1, 0x7f040000

    const v2, 0x7f040001

    invoke-virtual {v0, v1, v2, v3, v3}, Landroid/support/v4/app/FragmentTransaction;->setCustomAnimations(IIII)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->O:Lcom/roidapp/cloudlib/upload/x;

    const-string v3, "search_fragment"

    invoke-virtual {v1, v4, v2, v3}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 669
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 673
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->O:Lcom/roidapp/cloudlib/upload/x;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/upload/x;->a(Ljava/lang/String;)V

    .line 674
    return-void

    .line 671
    :cond_2
    check-cast v0, Lcom/roidapp/cloudlib/upload/x;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->O:Lcom/roidapp/cloudlib/upload/x;

    goto :goto_0
.end method

.method public final a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/template/TemplateInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1368
    return-void
.end method

.method public final a(Z)V
    .locals 2

    .prologue
    .line 1380
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->Q:Lcom/roidapp/cloudlib/template/TemplateInfo;

    if-eqz v0, :cond_0

    .line 1381
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "unlockTemplate"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/c/i;

    .line 1382
    if-eqz v0, :cond_0

    .line 1383
    if-eqz p1, :cond_1

    .line 1384
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/c/i;->a()V

    .line 1389
    :cond_0
    :goto_0
    return-void

    .line 1386
    :cond_1
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/c/i;->b()V

    goto :goto_0
.end method

.method public final b()Lcom/roidapp/cloudlib/ah;
    .locals 1

    .prologue
    .line 1334
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->P:Lcom/roidapp/cloudlib/template/b/c;

    return-object v0
.end method

.method public final b(I)V
    .locals 5

    .prologue
    const v4, 0x7f0d00d7

    const/4 v3, 0x0

    .line 560
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    .line 561
    invoke-virtual {v1, v4}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 562
    if-eqz v0, :cond_0

    instance-of v2, v0, Lcom/roidapp/photogrid/cloud/ch;

    if-nez v2, :cond_2

    .line 563
    :cond_0
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 564
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->N:Lcom/roidapp/photogrid/cloud/ch;

    if-nez v1, :cond_1

    .line 565
    new-instance v1, Lcom/roidapp/photogrid/cloud/ch;

    invoke-direct {v1}, Lcom/roidapp/photogrid/cloud/ch;-><init>()V

    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->N:Lcom/roidapp/photogrid/cloud/ch;

    .line 567
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->N:Lcom/roidapp/photogrid/cloud/ch;

    invoke-virtual {v1, p1}, Lcom/roidapp/photogrid/cloud/ch;->a(I)V

    .line 568
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->N:Lcom/roidapp/photogrid/cloud/ch;

    new-instance v2, Lcom/roidapp/photogrid/cloud/f;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/cloud/f;-><init>(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)V

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/cloud/ch;->a(Lcom/roidapp/photogrid/cloud/cm;)V

    .line 598
    const/high16 v1, 0x7f040000

    const v2, 0x7f040001

    invoke-virtual {v0, v1, v2, v3, v3}, Landroid/support/v4/app/FragmentTransaction;->setCustomAnimations(IIII)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->N:Lcom/roidapp/photogrid/cloud/ch;

    const-string v3, "tag_fragment"

    invoke-virtual {v1, v4, v2, v3}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 600
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 604
    :goto_0
    return-void

    .line 602
    :cond_2
    check-cast v0, Lcom/roidapp/photogrid/cloud/ch;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->N:Lcom/roidapp/photogrid/cloud/ch;

    goto :goto_0
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1401
    return-void
.end method

.method public final b(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/template/TemplateInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1372
    return-void
.end method

.method public final b(Z)V
    .locals 0

    .prologue
    .line 1393
    return-void
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1405
    return-void
.end method

.method public final c(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/template/TemplateInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1376
    return-void
.end method

.method public final d()V
    .locals 0

    .prologue
    .line 1343
    return-void
.end method

.method public final e()V
    .locals 0

    .prologue
    .line 1347
    return-void
.end method

.method public final f()V
    .locals 0

    .prologue
    .line 1351
    return-void
.end method

.method public final g()V
    .locals 3

    .prologue
    .line 1362
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->P:Lcom/roidapp/cloudlib/template/b/c;

    if-eqz v0, :cond_0

    .line 1363
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->P:Lcom/roidapp/cloudlib/template/b/c;

    const/16 v1, 0x2319

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->Q:Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-static {v0, v1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 1364
    :cond_0
    return-void
.end method

.method public final i()I
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 534
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->M:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 535
    if-nez v1, :cond_0

    .line 540
    :goto_0
    return v0

    .line 538
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->M:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v0

    .line 539
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v2

    .line 540
    neg-int v2, v2

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    mul-int/2addr v0, v1

    add-int/2addr v0, v2

    goto :goto_0
.end method

.method public final j()Z
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 607
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    instance-of v0, v0, Lcom/roidapp/photogrid/cloud/br;

    if-eqz v0, :cond_0

    .line 608
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    check-cast v0, Lcom/roidapp/photogrid/cloud/br;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/br;->i()V

    .line 611
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 612
    const v1, 0x7f0d00d7

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v1

    .line 613
    if-eqz v1, :cond_3

    instance-of v3, v1, Lcom/roidapp/photogrid/cloud/ch;

    if-eqz v3, :cond_3

    .line 614
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 618
    const/4 v0, 0x1

    move v1, v0

    .line 620
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->M:Landroid/widget/ListView;

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    .line 621
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->M:Landroid/widget/ListView;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->smoothScrollToPosition(I)V

    .line 622
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    instance-of v0, v0, Lcom/roidapp/photogrid/cloud/br;

    if-eqz v0, :cond_2

    .line 623
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    check-cast v0, Lcom/roidapp/photogrid/cloud/br;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/br;->l()V

    .line 624
    :cond_2
    return v1

    :cond_3
    move v1, v2

    goto :goto_0
.end method

.method public final k()Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 628
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    instance-of v0, v0, Lcom/roidapp/photogrid/cloud/br;

    if-eqz v0, :cond_0

    .line 629
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    check-cast v0, Lcom/roidapp/photogrid/cloud/br;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/br;->h()V

    .line 632
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 633
    const v2, 0x7f0d00d7

    invoke-virtual {v0, v2}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v2

    .line 634
    if-eqz v2, :cond_2

    instance-of v3, v2, Lcom/roidapp/cloudlib/upload/x;

    if-eqz v3, :cond_2

    .line 635
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 639
    const/4 v0, 0x1

    .line 641
    :goto_0
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->M:Landroid/widget/ListView;

    if-eqz v2, :cond_1

    if-eqz v0, :cond_1

    .line 642
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->M:Landroid/widget/ListView;

    invoke-virtual {v2, v1}, Landroid/widget/ListView;->smoothScrollToPosition(I)V

    .line 643
    :cond_1
    return v0

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method public final l()V
    .locals 2

    .prologue
    .line 1905
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->q:Z

    .line 1906
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->e:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1907
    return-void
.end method

.method public final m()V
    .locals 2

    .prologue
    .line 1910
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->q:Z

    .line 1911
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->e:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1912
    return-void
.end method

.method public final n_()V
    .locals 0

    .prologue
    .line 1339
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .prologue
    const v0, 0x8809

    const/4 v2, -0x1

    .line 719
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/photogrid/release/ParentActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 720
    sparse-switch p1, :sswitch_data_0

    .line 793
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v0, p1, p2, p3}, Lcom/roidapp/photogrid/cloud/o;->a(IILandroid/content/Intent;)V

    .line 796
    :cond_0
    :goto_0
    :sswitch_0
    return-void

    .line 723
    :sswitch_1
    const-string v0, "SharePage_View"

    const-string v1, "Share_BackShare"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 724
    if-ne p2, v2, :cond_0

    if-eqz p3, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 727
    :try_start_0
    const-string v0, "shareEntry"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 731
    :goto_1
    if-eqz v0, :cond_0

    const-string v1, "com.roidapp"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 732
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.SEND"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 733
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 734
    const-string v0, "android.intent.extra.STREAM"

    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 735
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->h:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 736
    const/high16 v0, 0x4000000

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 737
    const-string v0, "shareToSelf"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 738
    const v0, 0x8806

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->setResult(ILandroid/content/Intent;)V

    .line 739
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->finish()V

    goto :goto_0

    .line 729
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_1

    .line 745
    :sswitch_2
    const-string v0, "SharePage_View"

    const-string v1, "Share_BackShare"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 746
    sget-boolean v0, Lcom/roidapp/photogrid/FacebookMessengerActivity;->b:Z

    if-eqz v0, :cond_0

    .line 747
    const v0, 0x8803

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->setResult(I)V

    .line 748
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->finish()V

    .line 749
    const/4 v0, 0x0

    sput-boolean v0, Lcom/roidapp/photogrid/FacebookMessengerActivity;->b:Z

    goto :goto_0

    .line 753
    :sswitch_3
    if-eq p2, v2, :cond_1

    .line 754
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->m()V

    goto :goto_0

    .line 758
    :cond_1
    new-instance v0, Lcom/roidapp/photogrid/cloud/h;

    invoke-direct {v0, p0, p3}, Lcom/roidapp/photogrid/cloud/h;-><init>(Lcom/roidapp/photogrid/cloud/BaseShareActivity;Landroid/content/Intent;)V

    invoke-static {p0, v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/app/Activity;Lcom/roidapp/cloudlib/sns/w;)Z

    goto/16 :goto_0

    .line 785
    :sswitch_4
    if-ne p2, v0, :cond_0

    .line 786
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->setResult(I)V

    .line 787
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->finish()V

    goto/16 :goto_0

    .line 720
    :sswitch_data_0
    .sparse-switch
        0x33d8 -> :sswitch_0
        0x33d9 -> :sswitch_3
        0xacd1 -> :sswitch_1
        0xacd2 -> :sswitch_2
        0xacd3 -> :sswitch_4
    .end sparse-switch
.end method

.method public onClick(Landroid/view/View;)V
    .locals 10

    .prologue
    const/4 v2, 0x1

    const/4 v6, 0x4

    const-wide/16 v8, 0x1

    const/4 v3, 0x0

    .line 826
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1011
    :cond_0
    :goto_0
    return-void

    .line 828
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 829
    :goto_1
    const/4 v1, 0x0

    .line 830
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Share/"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 831
    sparse-switch v0, :sswitch_data_0

    .line 997
    if-ltz v0, :cond_30

    sget-object v4, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->d:[Lcom/roidapp/photogrid/cloud/p;

    array-length v4, v4

    if-ge v0, v4, :cond_30

    .line 998
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->n()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1000
    iput-boolean v3, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->w:Z

    .line 1001
    sget-object v1, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->d:[Lcom/roidapp/photogrid/cloud/p;

    aget-object v1, v1, v0

    iget-object v1, v1, Lcom/roidapp/photogrid/cloud/p;->c:Ljava/lang/String;

    sget-object v4, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->d:[Lcom/roidapp/photogrid/cloud/p;

    aget-object v4, v4, v0

    iget-object v4, v4, Lcom/roidapp/photogrid/cloud/p;->d:Ljava/lang/String;

    invoke-direct {p0, v1, v4, v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1002
    sget-object v1, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->d:[Lcom/roidapp/photogrid/cloud/p;

    aget-object v0, v1, v0

    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/p;->c:Ljava/lang/String;

    .line 1008
    :goto_2
    if-eqz v0, :cond_0

    .line 1009
    const-string v1, "share"

    invoke-virtual {p0, v1, v3}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v1, v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0

    .line 828
    :cond_2
    const/high16 v0, -0x80000000

    goto :goto_1

    .line 833
    :sswitch_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getCallingActivity()Landroid/content/ComponentName;

    move-result-object v0

    .line 834
    if-eqz v0, :cond_3

    .line 835
    invoke-virtual {v0}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v2

    const-class v4, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 836
    const-string v0, "Preview_Page"

    const-string v2, "Share_Preview"

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 843
    :cond_3
    :goto_3
    const v0, 0x8800

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->setResult(I)V

    .line 844
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    const-string v2, "Back"

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/cloud/a/q;->a(Ljava/lang/String;)V

    .line 845
    :cond_4
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->finish()V

    move-object v0, v1

    .line 846
    goto :goto_2

    .line 838
    :cond_5
    invoke-virtual {v0}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v0

    const-class v2, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 839
    const-string v0, "EditPage_View"

    const-string v2, "Share_Edit"

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    .line 848
    :sswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "option"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 849
    iput-boolean v3, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->w:Z

    .line 850
    const v0, 0x8801

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->setResult(I)V

    .line 851
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    if-eqz v0, :cond_6

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/o;->f()Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "shareoption"

    :goto_4
    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/cloud/a/q;->a(Ljava/lang/String;)V

    .line 852
    :cond_6
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->finish()V

    move-object v0, v1

    .line 853
    goto/16 :goto_2

    .line 851
    :cond_7
    const-string v0, "saveoption"

    goto :goto_4

    .line 856
    :sswitch_2
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->n()Z

    move-result v0

    if-nez v0, :cond_0

    .line 859
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "preview"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 860
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    const-string v2, "preview"

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/cloud/a/q;->a(Ljava/lang/String;)V

    .line 862
    :cond_8
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->j:Z

    if-nez v0, :cond_9

    .line 864
    new-instance v0, Lcom/roidapp/photogrid/release/jj;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/jj;-><init>()V

    .line 865
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/jj;->a(Ljava/lang/String;)V

    .line 866
    const/4 v1, 0x2

    invoke-virtual {v0, v3, v1}, Lcom/roidapp/photogrid/release/jj;->setStyle(II)V

    .line 867
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    const-string v2, "ImagePreviewDialogFragment"

    invoke-static {v1, v0, v2}, Lcom/roidapp/baselib/c/n;->a(Landroid/support/v4/app/FragmentManager;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)Z

    goto/16 :goto_0

    .line 872
    :cond_9
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 873
    new-instance v2, Ljava/io/File;

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    invoke-direct {v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->h:Ljava/lang/String;

    invoke-virtual {v0, v2, v4}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 876
    const v2, 0x7f0d00ce

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 877
    if-eqz v2, :cond_a

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    iput v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->G:I

    .line 880
    :cond_a
    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    .line 883
    goto/16 :goto_2

    .line 884
    :catch_0
    move-exception v0

    move-object v0, v1

    goto/16 :goto_2

    .line 3051
    :sswitch_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Facebook Message"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 3052
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v6, :cond_b

    .line 3053
    const-string v0, "SendMessenger"

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 3055
    :cond_b
    const-string v1, "SNS"

    const-string v2, "share_click"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/o;->f()Z

    move-result v0

    if-eqz v0, :cond_c

    const-string v0, "Save/Share/"

    :goto_5
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "Facebook Message"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v1, v2, v0}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3056
    const-string v1, "SNS"

    const-string v2, "share_click"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/o;->f()Z

    move-result v0

    if-eqz v0, :cond_d

    const-string v0, "Save/Share/"

    :goto_6
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "Facebook Message"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {p0, v1, v2, v0, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 3061
    invoke-static {p0}, Lcom/roidapp/photogrid/FacebookMessengerActivity;->a(Landroid/app/Activity;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 3064
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->h:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/FacebookMessengerActivity;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 3066
    const v0, 0x8809

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->setResult(I)V

    .line 3067
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->finish()V

    .line 887
    :goto_7
    const-string v0, "Messenger"

    goto/16 :goto_2

    .line 3055
    :cond_c
    const-string v0, "Save/Save/"

    goto :goto_5

    .line 3056
    :cond_d
    const-string v0, "Save/Save/"

    goto :goto_6

    .line 3070
    :cond_e
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->h:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/facebook/messenger/ShareToMessengerParams;->newBuilder(Landroid/net/Uri;Ljava/lang/String;)Lcom/facebook/messenger/ShareToMessengerParamsBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messenger/ShareToMessengerParamsBuilder;->build()Lcom/facebook/messenger/ShareToMessengerParams;

    move-result-object v0

    .line 3073
    const v1, 0xacd2

    invoke-static {p0, v1, v0}, Lcom/facebook/messenger/MessengerUtils;->shareToMessenger(Landroid/app/Activity;ILcom/facebook/messenger/ShareToMessengerParams;)V

    goto :goto_7

    .line 891
    :sswitch_4
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->n()Z

    move-result v0

    if-nez v0, :cond_0

    .line 893
    iput-boolean v3, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->w:Z

    .line 4026
    const-string v0, "com.instagram.android"

    invoke-static {p0, v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 4028
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "InstagramClick"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->n:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 4029
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    if-eqz v0, :cond_f

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    const-string v4, "share_Instagram"

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/cloud/a/q;->a(Ljava/lang/String;)V

    .line 4030
    :cond_f
    const-string v4, "SNS"

    const-string v5, "share_click"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/o;->f()Z

    move-result v0

    if-eqz v0, :cond_12

    const-string v0, "Save/Share/"

    :goto_8
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, "Instagram"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v4, v5, v0}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4031
    const-string v4, "SNS"

    const-string v5, "share_click"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/o;->f()Z

    move-result v0

    if-eqz v0, :cond_13

    const-string v0, "Save/Share/"

    :goto_9
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, "Instagram"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-static {p0, v4, v5, v0, v6}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 4034
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->j:Z

    if-nez v0, :cond_11

    .line 4242
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->C:[I

    if-nez v0, :cond_10

    .line 4243
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    invoke-static {v0}, Lcom/roidapp/imagelib/b/d;->a(Ljava/lang/String;)[I

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->C:[I

    .line 4245
    :cond_10
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->C:[I

    if-eqz v0, :cond_14

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->C:[I

    array-length v0, v0

    const/4 v4, 0x2

    if-lt v0, v4, :cond_14

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->C:[I

    aget v0, v0, v3

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->C:[I

    aget v4, v4, v2

    if-ne v0, v4, :cond_14

    move v0, v2

    .line 4034
    :goto_a
    if-eqz v0, :cond_15

    .line 4037
    :cond_11
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->h:Ljava/lang/String;

    invoke-direct {p0, v0, v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v1

    goto/16 :goto_2

    .line 4030
    :cond_12
    const-string v0, "Save/Save/"

    goto :goto_8

    .line 4031
    :cond_13
    const-string v0, "Save/Save/"

    goto :goto_9

    :cond_14
    move v0, v3

    .line 4245
    goto :goto_a

    .line 4249
    :cond_15
    const-string v0, "FitInstagramDialog"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 4250
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    new-instance v2, Lcom/roidapp/photogrid/cloud/n;

    invoke-direct {v2}, Lcom/roidapp/photogrid/cloud/n;-><init>()V

    invoke-virtual {v2, p0}, Lcom/roidapp/photogrid/cloud/n;->a(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)Lcom/roidapp/photogrid/cloud/n;

    move-result-object v2

    const-string v4, "fit_instagram_dialog"

    invoke-static {v0, v2, v4}, Lcom/roidapp/baselib/c/n;->a(Landroid/support/v4/app/FragmentManager;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)Z

    move-object v0, v1

    .line 4041
    goto/16 :goto_2

    .line 4045
    :cond_16
    const v0, 0x7f0701f4

    invoke-static {p0, v0}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    move-object v0, v1

    .line 897
    goto/16 :goto_2

    .line 900
    :sswitch_5
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->n()Z

    move-result v0

    if-nez v0, :cond_0

    .line 902
    iput-boolean v3, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->w:Z

    .line 5126
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "Other"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->n:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 5127
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v6, :cond_17

    .line 5128
    const-string v0, "SendOther"

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->g()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/roidapp/baselib/c/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 5130
    :cond_17
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    if-eqz v0, :cond_18

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    const-string v2, "share_Other"

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/cloud/a/q;->a(Ljava/lang/String;)V

    .line 5131
    :cond_18
    const-string v2, "SNS"

    const-string v4, "share_click"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/o;->f()Z

    move-result v0

    if-eqz v0, :cond_19

    const-string v0, "Save/Share/"

    :goto_b
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, "Other"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v2, v4, v0}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 5132
    const-string v2, "SNS"

    const-string v4, "share_click"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/o;->f()Z

    move-result v0

    if-eqz v0, :cond_1a

    const-string v0, "Save/Share/"

    :goto_c
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, "Other"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {p0, v2, v4, v0, v5}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 5134
    new-instance v2, Landroid/content/Intent;

    const-string v0, "android.intent.action.SEND"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 5135
    const-string v4, "android.intent.extra.SUBJECT"

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->A:Ljava/lang/String;

    if-nez v0, :cond_1b

    const-string v0, ""

    :goto_d
    invoke-virtual {v2, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5136
    const-string v0, "android.intent.extra.TEXT"

    const v4, 0x7f0702be

    invoke-virtual {p0, v4}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5137
    const-string v0, "android.intent.extra.STREAM"

    new-instance v4, Ljava/io/File;

    iget-object v5, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v4}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 5138
    const-string v0, "pgMode"

    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getCallingActivity()Landroid/content/ComponentName;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5139
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->h:Ljava/lang/String;

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 5140
    const/high16 v0, 0x4000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 5142
    const v0, 0xacd1

    :try_start_1
    invoke-virtual {p0, v2, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v0, v1

    .line 5145
    goto/16 :goto_2

    .line 5131
    :cond_19
    const-string v0, "Save/Save/"

    goto/16 :goto_b

    .line 5132
    :cond_1a
    const-string v0, "Save/Save/"

    goto :goto_c

    .line 5135
    :cond_1b
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->A:Ljava/lang/String;

    goto :goto_d

    .line 904
    :catch_1
    move-exception v0

    move-object v0, v1

    goto/16 :goto_2

    .line 906
    :sswitch_6
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->n()Z

    move-result v0

    if-nez v0, :cond_0

    .line 908
    iput-boolean v3, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->w:Z

    .line 5149
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Email"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 5150
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v6, :cond_1c

    .line 5151
    const-string v0, "SendEmail"

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 5153
    :cond_1c
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    if-eqz v0, :cond_1d

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    const-string v1, "share_Email"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/a/q;->a(Ljava/lang/String;)V

    .line 5154
    :cond_1d
    const-string v1, "SNS"

    const-string v2, "share_click"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/o;->f()Z

    move-result v0

    if-eqz v0, :cond_1e

    const-string v0, "Save/Share/"

    :goto_e
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "Email"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v1, v2, v0}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 5155
    const-string v1, "SNS"

    const-string v2, "share_click"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/o;->f()Z

    move-result v0

    if-eqz v0, :cond_1f

    const-string v0, "Save/Share/"

    :goto_f
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "Email"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {p0, v1, v2, v0, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 5156
    new-instance v1, Landroid/content/Intent;

    const-string v0, "android.intent.action.SEND"

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 5157
    const-string v0, "text/html"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 5158
    const-string v0, "android.intent.extra.STREAM"

    new-instance v2, Ljava/io/File;

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    invoke-direct {v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 5159
    const-string v2, "android.intent.extra.SUBJECT"

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->A:Ljava/lang/String;

    if-nez v0, :cond_20

    const-string v0, ""

    :goto_10
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5160
    const-string v0, "android.intent.extra.TEXT"

    const v2, 0x7f0702bd

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 5161
    const/high16 v0, 0x4000000

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 5163
    const v0, 0xacd1

    :try_start_2
    invoke-virtual {p0, v1, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_2
    .catch Landroid/content/ActivityNotFoundException; {:try_start_2 .. :try_end_2} :catch_3

    .line 910
    :goto_11
    const v0, 0x7f070140

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_2

    .line 5154
    :cond_1e
    const-string v0, "Save/Save/"

    goto/16 :goto_e

    .line 5155
    :cond_1f
    const-string v0, "Save/Save/"

    goto :goto_f

    .line 5159
    :cond_20
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->A:Ljava/lang/String;

    goto :goto_10

    .line 913
    :sswitch_7
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->n()Z

    move-result v0

    if-nez v0, :cond_0

    .line 915
    iput-boolean v3, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->w:Z

    .line 5170
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Goolge"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 5171
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v6, :cond_21

    .line 5172
    const-string v0, "SendGoogle"

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 5174
    :cond_21
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    if-eqz v0, :cond_22

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    const-string v1, "share_Goolge"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/a/q;->a(Ljava/lang/String;)V

    .line 5175
    :cond_22
    const-string v1, "SNS"

    const-string v2, "share_click"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/o;->f()Z

    move-result v0

    if-eqz v0, :cond_25

    const-string v0, "Save/Share/"

    :goto_12
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "Goolge"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v1, v2, v0}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 5176
    const-string v1, "SNS"

    const-string v2, "share_click"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/o;->f()Z

    move-result v0

    if-eqz v0, :cond_26

    const-string v0, "Save/Share/"

    :goto_13
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "Goolge"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {p0, v1, v2, v0, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 5178
    new-instance v0, Lcom/google/android/gms/plus/i;

    invoke-direct {v0, p0}, Lcom/google/android/gms/plus/i;-><init>(Landroid/app/Activity;)V

    .line 5179
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v1}, Lcom/roidapp/photogrid/cloud/o;->e()Ljava/lang/String;

    move-result-object v1

    .line 5181
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_23

    .line 5182
    invoke-virtual {v0, v1}, Lcom/google/android/gms/plus/i;->a(Ljava/lang/CharSequence;)Lcom/google/android/gms/plus/i;

    .line 5183
    :cond_23
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/plus/i;->a(Ljava/lang/String;)Lcom/google/android/gms/plus/i;

    .line 5184
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/plus/i;->a(Landroid/net/Uri;)Lcom/google/android/gms/plus/i;

    .line 5185
    invoke-virtual {v0}, Lcom/google/android/gms/plus/i;->a()Landroid/content/Intent;

    move-result-object v0

    .line 5186
    if-eqz v0, :cond_24

    .line 5187
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 5189
    const v1, 0xacd1

    :try_start_3
    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_3
    .catch Landroid/content/ActivityNotFoundException; {:try_start_3 .. :try_end_3} :catch_4

    .line 917
    :cond_24
    :goto_14
    const-string v0, "Google+"

    goto/16 :goto_2

    .line 5175
    :cond_25
    const-string v0, "Save/Save/"

    goto :goto_12

    .line 5176
    :cond_26
    const-string v0, "Save/Save/"

    goto :goto_13

    .line 920
    :sswitch_8
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->n()Z

    move-result v0

    if-nez v0, :cond_0

    .line 922
    iput-boolean v3, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->w:Z

    .line 923
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Pinterest"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 924
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v6, :cond_27

    .line 925
    const-string v0, "SendPinterest"

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 927
    :cond_27
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    if-eqz v0, :cond_28

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    const-string v1, "share_Pinterest"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/a/q;->a(Ljava/lang/String;)V

    .line 928
    :cond_28
    const-string v1, "SNS"

    const-string v2, "share_click"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/o;->f()Z

    move-result v0

    if-eqz v0, :cond_2a

    const-string v0, "Save/Share/"

    :goto_15
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "Pinterest"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v1, v2, v0}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 929
    const-string v1, "SNS"

    const-string v2, "share_click"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/o;->f()Z

    move-result v0

    if-eqz v0, :cond_2b

    const-string v0, "Save/Share/"

    :goto_16
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "Pinterest"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {p0, v1, v2, v0, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 930
    const-string v0, "1434491"

    invoke-static {v0}, Lcom/pinterest/pinit/PinIt;->setPartnerId(Ljava/lang/String;)V

    .line 931
    invoke-static {v3}, Lcom/pinterest/pinit/PinIt;->setDebugMode(Z)V

    .line 932
    new-instance v1, Lcom/pinterest/pinit/PinIt;

    invoke-direct {v1}, Lcom/pinterest/pinit/PinIt;-><init>()V

    .line 933
    new-instance v0, Ljava/io/File;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/pinterest/pinit/PinIt;->setImageUri(Landroid/net/Uri;)V

    .line 934
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/o;->e()Ljava/lang/String;

    move-result-object v0

    .line 935
    if-nez v0, :cond_29

    const v0, 0x7f0702be

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    :cond_29
    invoke-virtual {v1, v0}, Lcom/pinterest/pinit/PinIt;->setDescription(Ljava/lang/String;)V

    .line 936
    new-instance v0, Lcom/roidapp/photogrid/cloud/i;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/i;-><init>(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)V

    invoke-virtual {v1, v0}, Lcom/pinterest/pinit/PinIt;->setListener(Lcom/pinterest/pinit/PinItListener;)V

    .line 947
    new-instance v0, Lcom/roidapp/photogrid/cloud/j;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/j;-><init>(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)V

    invoke-virtual {v1, v0}, Lcom/pinterest/pinit/PinIt;->setListener(Lcom/pinterest/pinit/PinItListener;)V

    .line 954
    invoke-virtual {v1, p0}, Lcom/pinterest/pinit/PinIt;->doPinIt(Landroid/content/Context;)V

    .line 955
    const-string v0, "Pinterest"

    goto/16 :goto_2

    .line 928
    :cond_2a
    const-string v0, "Save/Save/"

    goto/16 :goto_15

    .line 929
    :cond_2b
    const-string v0, "Save/Save/"

    goto :goto_16

    .line 958
    :sswitch_9
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->n()Z

    move-result v0

    if-nez v0, :cond_0

    .line 960
    iput-boolean v3, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->w:Z

    .line 962
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "Print"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->n:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 963
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v6, :cond_2c

    .line 964
    const-string v0, "SendPrint"

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->g()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/roidapp/baselib/c/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 966
    :cond_2c
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    if-eqz v0, :cond_2d

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    const-string v4, "share_Print"

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/cloud/a/q;->a(Ljava/lang/String;)V

    .line 967
    :cond_2d
    const-string v4, "SNS"

    const-string v5, "share_click"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/o;->f()Z

    move-result v0

    if-eqz v0, :cond_2e

    const-string v0, "Save/Share/"

    :goto_17
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, "Print"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v4, v5, v0}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 968
    const-string v4, "SNS"

    const-string v5, "share_click"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/o;->f()Z

    move-result v0

    if-eqz v0, :cond_2f

    const-string v0, "Save/Share/"

    :goto_18
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, "Print"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-static {p0, v4, v5, v0, v6}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 969
    new-instance v0, Ljava/io/File;

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 970
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_31

    .line 971
    new-instance v4, Landroid/support/v4/print/PrintHelper;

    invoke-direct {v4, p0}, Landroid/support/v4/print/PrintHelper;-><init>(Landroid/content/Context;)V

    .line 972
    invoke-virtual {v4, v2}, Landroid/support/v4/print/PrintHelper;->setScaleMode(I)V

    .line 974
    :try_start_4
    const-string v2, "PhotoGrid Share"

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v4, v2, v0}, Landroid/support/v4/print/PrintHelper;->printBitmap(Ljava/lang/String;Landroid/net/Uri;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    move-object v0, v1

    .line 978
    goto/16 :goto_2

    .line 967
    :cond_2e
    const-string v0, "Save/Save/"

    goto :goto_17

    .line 968
    :cond_2f
    const-string v0, "Save/Save/"

    goto :goto_18

    .line 977
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move-object v0, v1

    .line 979
    goto/16 :goto_2

    .line 982
    :sswitch_a
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->n()Z

    move-result v0

    if-nez v0, :cond_0

    .line 984
    iput-boolean v3, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->w:Z

    .line 985
    const-string v0, "Whatsapp"

    const-string v1, "com.whatsapp"

    invoke-direct {p0, v0, v1, v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 986
    const-string v0, "Whatsapp"

    goto/16 :goto_2

    .line 990
    :sswitch_b
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->n()Z

    move-result v1

    if-nez v1, :cond_0

    .line 992
    iput-boolean v3, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->w:Z

    .line 993
    sget-object v1, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->d:[Lcom/roidapp/photogrid/cloud/p;

    aget-object v1, v1, v0

    iget-object v1, v1, Lcom/roidapp/photogrid/cloud/p;->c:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->d:[Lcom/roidapp/photogrid/cloud/p;

    aget-object v2, v2, v0

    iget-object v2, v2, Lcom/roidapp/photogrid/cloud/p;->d:Ljava/lang/String;

    invoke-direct {p0, v1, v2, v3}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 994
    sget-object v1, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->d:[Lcom/roidapp/photogrid/cloud/p;

    aget-object v0, v1, v0

    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/p;->c:Ljava/lang/String;

    goto/16 :goto_2

    .line 1005
    :cond_30
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v0, p1}, Lcom/roidapp/photogrid/cloud/o;->a(Landroid/view/View;)V

    :cond_31
    move-object v0, v1

    goto/16 :goto_2

    :catch_3
    move-exception v0

    goto/16 :goto_11

    :catch_4
    move-exception v0

    goto/16 :goto_14

    .line 831
    nop

    :sswitch_data_0
    .sparse-switch
        -0x8 -> :sswitch_3
        -0x7 -> :sswitch_a
        -0x6 -> :sswitch_8
        -0x5 -> :sswitch_9
        -0x4 -> :sswitch_5
        -0x3 -> :sswitch_6
        -0x2 -> :sswitch_7
        0x1 -> :sswitch_b
        0x7f0d0028 -> :sswitch_0
        0x7f0d00a1 -> :sswitch_2
        0x7f0d00a2 -> :sswitch_2
        0x7f0d00a4 -> :sswitch_4
        0x7f0d00a6 -> :sswitch_5
        0x7f0d00c4 -> :sswitch_4
        0x7f0d00d0 -> :sswitch_1
    .end sparse-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 13

    .prologue
    const/16 v12, 0x64

    const/4 v11, 0x3

    const/4 v10, 0x2

    const/4 v2, 0x1

    const/4 v9, 0x0

    .line 272
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 275
    const v0, 0x7f030024

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 283
    :goto_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->v:Z

    if-nez v0, :cond_0

    .line 285
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a(Landroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 286
    const v0, 0x8800

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->setResult(I)V

    .line 287
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->finish()V

    .line 293
    :cond_0
    :goto_1
    return-void

    .line 278
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 279
    iput-boolean v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->v:Z

    .line 280
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto :goto_0

    .line 2428
    :cond_1
    invoke-static {p0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->p:Z

    .line 2429
    const v0, 0x7f0d0028

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2431
    const v0, 0x7f0d00d0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 2432
    iget-boolean v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->B:Z

    if-eqz v1, :cond_6

    .line 2433
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2440
    :goto_2
    const v0, 0x7f0d00d6

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->e:Landroid/view/View;

    .line 2441
    const v0, 0x7f0d00d2

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->J:Landroid/widget/RelativeLayout;

    .line 2442
    const v0, 0x7f0d00d3

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->K:Landroid/widget/TextView;

    .line 2443
    const v0, 0x7f0d00d7

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->L:Landroid/widget/RelativeLayout;

    .line 2452
    const v0, 0x7f0d00d1

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->M:Landroid/widget/ListView;

    .line 2454
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->M:Landroid/widget/ListView;

    invoke-interface {v0, v1}, Lcom/roidapp/photogrid/cloud/o;->a(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 2455
    if-eqz v0, :cond_2

    .line 2456
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->M:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 2459
    :cond_2
    new-instance v0, Lcom/roidapp/photogrid/cloud/a/q;

    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v3, 0x6

    if-ne v1, v3, :cond_7

    :goto_3
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v1}, Lcom/roidapp/photogrid/cloud/o;->f()Z

    move-result v3

    iget-boolean v4, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->H:Z

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v1}, Lcom/roidapp/photogrid/cloud/o;->b()[Lcom/roidapp/photogrid/cloud/a/l;

    move-result-object v5

    iget-object v6, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->M:Landroid/widget/ListView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->l:Ljava/lang/String;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v1}, Lcom/roidapp/photogrid/cloud/o;->f()Z

    move-result v1

    if-eqz v1, :cond_8

    const-string v1, "Share/finish"

    :goto_4
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    move-object v1, p0

    move-object v8, p0

    invoke-direct/range {v0 .. v8}, Lcom/roidapp/photogrid/cloud/a/q;-><init>(Lcom/roidapp/photogrid/release/ParentActivity;ZZZ[Lcom/roidapp/photogrid/cloud/a/l;Landroid/widget/ListView;Ljava/lang/String;Lcom/roidapp/photogrid/cloud/a/t;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    .line 2463
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/o;->c()I

    .line 2465
    const v0, 0x7f0d00a1

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->s:Landroid/widget/ImageView;

    .line 2466
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->s:Landroid/widget/ImageView;

    if-eqz v0, :cond_5

    .line 2467
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->s:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2468
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 2469
    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 2470
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->s:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setAnimation(Landroid/view/animation/Animation;)V

    .line 2471
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->s:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 2472
    if-lez v1, :cond_3

    .line 2473
    iput v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->k:I

    .line 2474
    :cond_3
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->j:Z

    if-eqz v0, :cond_b

    .line 2476
    const v0, 0x7f0d00b7

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 2477
    if-eqz v0, :cond_4

    .line 2478
    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 2479
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v2

    :goto_5
    invoke-static {v2, v3}, Lcom/roidapp/photogrid/release/rf;->a(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2480
    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2483
    :cond_4
    const v0, 0x7f0d00a2

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 2484
    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2485
    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 2486
    iget v3, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->k:I

    if-ge v1, v12, :cond_a

    move v1, v10

    :goto_6
    div-int v1, v3, v1

    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 2487
    const v1, 0x7f0200fa

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2488
    invoke-virtual {v0, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2501
    :cond_5
    :goto_7
    iput-boolean v9, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->E:Z

    .line 291
    new-instance v0, Lcom/roidapp/photogrid/cloud/r;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/r;-><init>(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->y:Lcom/roidapp/photogrid/cloud/r;

    goto/16 :goto_1

    .line 2436
    :cond_6
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v1}, Lcom/roidapp/photogrid/cloud/o;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 2437
    const v0, 0x7f0d00d0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_2

    :cond_7
    move v2, v9

    .line 2459
    goto/16 :goto_3

    :cond_8
    const-string v1, "Save/finish"

    goto/16 :goto_4

    .line 2479
    :cond_9
    const-wide/16 v2, 0x0

    goto :goto_5

    :cond_a
    move v1, v11

    .line 2486
    goto :goto_6

    .line 2490
    :cond_b
    const v0, 0x7f0d00a2

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 2491
    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2492
    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 2493
    iget v3, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->k:I

    if-ge v1, v12, :cond_c

    :goto_8
    div-int v1, v3, v10

    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 2494
    const v1, 0x7f0200dc

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2495
    invoke-virtual {v0, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_7

    :cond_c
    move v10, v11

    .line 2493
    goto :goto_8
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 395
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onDestroy()V

    .line 396
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    if-eqz v0, :cond_0

    .line 397
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/o;->g()V

    .line 400
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->P:Lcom/roidapp/cloudlib/template/b/c;

    if-eqz v0, :cond_1

    .line 401
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->P:Lcom/roidapp/cloudlib/template/b/c;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/c;->a()V

    .line 402
    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->P:Lcom/roidapp/cloudlib/template/b/c;

    .line 404
    :cond_1
    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->Q:Lcom/roidapp/cloudlib/template/TemplateInfo;

    .line 405
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    if-eqz v0, :cond_2

    .line 406
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/a/q;->b()V

    .line 407
    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    .line 409
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->y:Lcom/roidapp/photogrid/cloud/r;

    if-eqz v0, :cond_3

    .line 410
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->y:Lcom/roidapp/photogrid/cloud/r;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/r;->a()V

    .line 411
    :cond_3
    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->y:Lcom/roidapp/photogrid/cloud/r;

    .line 412
    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    .line 415
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->s:Landroid/widget/ImageView;

    if-eqz v0, :cond_4

    .line 416
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->s:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 417
    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->s:Landroid/widget/ImageView;

    .line 420
    :cond_4
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 6

    .prologue
    const-wide/16 v4, 0x1

    const/4 v0, 0x0

    .line 800
    const/4 v1, 0x4

    if-ne p1, v1, :cond_3

    .line 801
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->j()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 802
    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "back/closehashtags"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v1, v2, v3}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 803
    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "back/closehashtags"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {p0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 821
    :cond_0
    :goto_0
    return v0

    .line 806
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->k()Z

    move-result v1

    if-nez v1, :cond_0

    .line 808
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getCallingActivity()Landroid/content/ComponentName;

    move-result-object v0

    .line 809
    if-eqz v0, :cond_2

    .line 810
    invoke-virtual {v0}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 811
    const-string v0, "Preview_Page"

    const-string v1, "Share_Preview"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 817
    :cond_2
    :goto_1
    const v0, 0x8800

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->setResult(I)V

    .line 819
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    const-string v1, "Back"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/a/q;->a(Ljava/lang/String;)V

    .line 821
    :cond_3
    invoke-super {p0, p1, p2}, Lcom/roidapp/photogrid/release/ParentActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0

    .line 813
    :cond_4
    invoke-virtual {v0}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 814
    const-string v0, "EditPage_View"

    const-string v1, "Share_Edit"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 302
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 303
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->v:Z

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a(Landroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 304
    const v0, 0x8800

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->setResult(I)V

    .line 305
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->finish()V

    .line 307
    :cond_0
    return-void
.end method

.method protected onPause()V
    .locals 2

    .prologue
    .line 353
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->v:Z

    if-eqz v0, :cond_1

    .line 354
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onPause()V

    .line 365
    :cond_0
    :goto_0
    return-void

    .line 357
    :cond_1
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onPause()V

    .line 358
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->y:Lcom/roidapp/photogrid/cloud/r;

    if-eqz v0, :cond_0

    .line 359
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->y:Lcom/roidapp/photogrid/cloud/r;

    const v1, 0xcc01

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/r;->removeMessages(I)V

    .line 360
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->y:Lcom/roidapp/photogrid/cloud/r;

    const v1, 0xcc02

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/r;->removeMessages(I)V

    goto :goto_0
.end method

.method protected onResume()V
    .locals 6

    .prologue
    const v2, 0x8800

    const/4 v5, 0x0

    .line 311
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onResume()V

    .line 312
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->v:Z

    if-eqz v0, :cond_1

    .line 349
    :cond_0
    :goto_0
    return-void

    .line 315
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    if-eqz v0, :cond_3

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    array-length v0, v0

    if-nez v0, :cond_3

    .line 316
    :cond_2
    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->setResult(I)V

    .line 317
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->finish()V

    goto :goto_0

    .line 320
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_5

    .line 321
    :cond_4
    const v0, 0x7f07022b

    invoke-static {p0, v0}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    .line 322
    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->setResult(I)V

    .line 323
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->finish()V

    goto :goto_0

    .line 326
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->y:Lcom/roidapp/photogrid/cloud/r;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->s:Landroid/widget/ImageView;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->s:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_6

    .line 327
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->y:Lcom/roidapp/photogrid/cloud/r;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->y:Lcom/roidapp/photogrid/cloud/r;

    const v3, 0xcc01

    iget v4, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->k:I

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->g:Ljava/lang/String;

    if-nez v0, :cond_9

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    :goto_1
    invoke-virtual {v2, v3, v4, v5, v0}, Lcom/roidapp/photogrid/cloud/r;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    const-wide/16 v2, 0x1f4

    invoke-virtual {v1, v0, v2, v3}, Lcom/roidapp/photogrid/cloud/r;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 332
    :cond_6
    iget v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->G:I

    if-lez v0, :cond_8

    .line 333
    const v0, 0x7f0d00ce

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 334
    if-eqz v0, :cond_7

    .line 335
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 336
    if-eqz v1, :cond_7

    .line 337
    iget v2, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->G:I

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 338
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 341
    :cond_7
    iput v5, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->G:I

    .line 344
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/o;->a()V

    .line 346
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    if-eqz v0, :cond_0

    .line 347
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->I:Lcom/roidapp/photogrid/cloud/a/q;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/a/q;->a()V

    goto/16 :goto_0

    .line 327
    :cond_9
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->g:Ljava/lang/String;

    goto :goto_1
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 425
    return-void
.end method

.method protected onStart()V
    .locals 1

    .prologue
    .line 369
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onStart()V

    .line 371
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    if-eqz v0, :cond_0

    .line 372
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    instance-of v0, v0, Lcom/roidapp/photogrid/cloud/br;

    if-eqz v0, :cond_1

    .line 373
    const-string v0, "SaveFinishPage/Share"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;)V

    .line 378
    :cond_0
    :goto_0
    return-void

    .line 375
    :cond_1
    const-string v0, "SaveFinishPage/Save"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected onStop()V
    .locals 2

    .prologue
    .line 382
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onStop()V

    .line 384
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    if-eqz v0, :cond_0

    .line 385
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->r:Lcom/roidapp/photogrid/cloud/o;

    instance-of v0, v0, Lcom/roidapp/photogrid/cloud/br;

    if-eqz v0, :cond_1

    .line 386
    const-string v0, "SaveFinishPage/Share"

    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->A()I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;I)V

    .line 391
    :cond_0
    :goto_0
    return-void

    .line 388
    :cond_1
    const-string v0, "SaveFinishPage/Save"

    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->A()I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;I)V

    goto :goto_0
.end method

.method public final x()V
    .locals 1

    .prologue
    .line 297
    const-string v0, "share"

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->t:Ljava/lang/String;

    .line 298
    return-void
.end method
