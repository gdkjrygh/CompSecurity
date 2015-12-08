.class public final Lcom/roidapp/photogrid/cloud/br;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/photogrid/cloud/o;


# static fields
.field public static c:Ljava/lang/String;

.field private static final e:[Lcom/roidapp/photogrid/cloud/p;


# instance fields
.field private A:Landroid/widget/CheckBox;

.field private B:Lcom/roidapp/photogrid/cloud/ce;

.field private C:I

.field private D:I

.field private E:Ljava/lang/String;

.field private F:Landroid/os/Handler;

.field public a:Landroid/widget/LinearLayout;

.field public b:Landroid/widget/RelativeLayout;

.field d:Lcom/roidapp/cloudlib/sns/upload/j;

.field private f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

.field private g:Landroid/widget/EditText;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/CheckBox;

.field private j:Landroid/widget/CheckBox;

.field private k:Landroid/widget/RelativeLayout;

.field private l:Landroid/widget/RelativeLayout;

.field private m:Landroid/widget/RelativeLayout;

.field private n:Landroid/widget/ProgressBar;

.field private o:Landroid/widget/TextView;

.field private p:Ljava/lang/String;

.field private q:[Ljava/lang/String;

.field private r:I

.field private s:I

.field private t:Lcom/facebook/CallbackManager;

.field private u:Z

.field private v:I

.field private w:J

.field private x:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private z:Landroid/widget/CheckBox;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    .line 103
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/roidapp/photogrid/cloud/p;

    const/4 v1, 0x0

    new-instance v2, Lcom/roidapp/photogrid/cloud/p;

    const v3, 0x7f02016a

    const-string v4, "Line"

    const-string v5, "jp.naver.line.android"

    invoke-direct {v2, v3, v4, v5}, Lcom/roidapp/photogrid/cloud/p;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/4 v1, 0x1

    new-instance v2, Lcom/roidapp/photogrid/cloud/p;

    const v3, 0x7f020195

    const-string v4, "Wechat"

    const-string v5, "com.tencent.mm"

    invoke-direct {v2, v3, v4, v5}, Lcom/roidapp/photogrid/cloud/p;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/4 v1, 0x2

    new-instance v2, Lcom/roidapp/photogrid/cloud/p;

    const v3, 0x7f020182

    const-string v4, "Skype"

    const-string v5, "com.skype.raider"

    invoke-direct {v2, v3, v4, v5}, Lcom/roidapp/photogrid/cloud/p;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/4 v1, 0x3

    new-instance v2, Lcom/roidapp/photogrid/cloud/p;

    const v3, 0x7f02018a

    const-string v4, "Telegram"

    const-string v5, "org.telegram.messenger"

    invoke-direct {v2, v3, v4, v5}, Lcom/roidapp/photogrid/cloud/p;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    sput-object v0, Lcom/roidapp/photogrid/cloud/br;->e:[Lcom/roidapp/photogrid/cloud/p;

    .line 835
    const-string v0, "https://www.facebook.com/help/249141925204375/"

    sput-object v0, Lcom/roidapp/photogrid/cloud/br;->c:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)V
    .locals 4

    .prologue
    const/4 v2, -0x1

    const/4 v3, 0x0

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 124
    const-string v0, "#Hashtag"

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->p:Ljava/lang/String;

    .line 125
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->q:[Ljava/lang/String;

    .line 130
    iput-boolean v3, p0, Lcom/roidapp/photogrid/cloud/br;->u:Z

    .line 131
    sget v0, Lcom/roidapp/cloudlib/sns/upload/b;->a:I

    iput v0, p0, Lcom/roidapp/photogrid/cloud/br;->v:I

    .line 134
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/roidapp/photogrid/cloud/br;->w:J

    .line 135
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->x:Ljava/util/ArrayList;

    .line 136
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->y:Ljava/util/ArrayList;

    .line 140
    iput v2, p0, Lcom/roidapp/photogrid/cloud/br;->C:I

    .line 141
    iput v2, p0, Lcom/roidapp/photogrid/cloud/br;->D:I

    .line 142
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->E:Ljava/lang/String;

    .line 281
    new-instance v0, Lcom/roidapp/photogrid/cloud/cg;

    invoke-direct {v0, p0, v3}, Lcom/roidapp/photogrid/cloud/cg;-><init>(Lcom/roidapp/photogrid/cloud/br;B)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->F:Landroid/os/Handler;

    .line 1044
    new-instance v0, Lcom/roidapp/photogrid/cloud/bt;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/bt;-><init>(Lcom/roidapp/photogrid/cloud/br;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->d:Lcom/roidapp/cloudlib/sns/upload/j;

    .line 146
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    .line 148
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Share/Finish/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p1, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/roidapp/photogrid/common/af;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 149
    invoke-virtual {p1}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v0

    const-string v1, "event"

    const-string v2, "mother2015"

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 150
    const-string v0, "#Mother\'s Day"

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->p:Ljava/lang/String;

    .line 151
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, " #mother"

    aput-object v1, v0, v3

    const/4 v1, 0x1

    const-string v2, " #mothersday"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, " #mothernature"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, " #motherhood"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, " #mom"

    aput-object v2, v0, v1

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->q:[Ljava/lang/String;

    .line 159
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/br;I)I
    .locals 0

    .prologue
    .line 84
    iput p1, p0, Lcom/roidapp/photogrid/cloud/br;->D:I

    return p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/br;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 84
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/br;->E:Ljava/lang/String;

    return-object p1
.end method

.method private static a([Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .prologue
    .line 1033
    if-nez p0, :cond_1

    .line 1034
    const/4 v0, 0x0

    .line 1041
    :cond_0
    return-object v0

    .line 1035
    :cond_1
    array-length v3, p0

    .line 1036
    const-string v1, ""

    .line 1037
    const/4 v0, 0x0

    move v4, v0

    move-object v0, v1

    move v1, v4

    :goto_0
    if-ge v1, v3, :cond_0

    .line 1038
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    aget-object v2, p0, v1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1039
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1037
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    move-object v0, v2

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/br;)Ljava/util/Collection;
    .locals 1

    .prologue
    .line 84
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/br;->m()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/facebook/AccessToken;)V
    .locals 4

    .prologue
    const/4 v2, 0x1

    .line 1188
    if-nez p1, :cond_0

    .line 1241
    :goto_0
    return-void

    .line 1190
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->j:Z

    if-eqz v0, :cond_2

    sget-object v0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->b:[Ljava/lang/String;

    .line 1191
    :goto_1
    invoke-static {v0}, Lcom/roidapp/cloudlib/facebook/al;->a([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 1192
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->j:Z

    if-eqz v0, :cond_3

    .line 1193
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setSelected(Z)V

    .line 1194
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->k:Landroid/widget/RelativeLayout;

    const v1, 0x7f0200ef

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 1238
    :cond_1
    :goto_2
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const-class v2, Lcom/roidapp/photogrid/cmid/LoginService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1239
    const-string v1, "ACTION_LOGIN_BY_FACEBOOK"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1240
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0

    .line 1190
    :cond_2
    sget-object v0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->c:[Ljava/lang/String;

    goto :goto_1

    .line 1196
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->i:Landroid/widget/CheckBox;

    invoke-virtual {v0, v2}, Landroid/widget/CheckBox;->setSelected(Z)V

    goto :goto_2

    .line 1201
    :cond_4
    iget-boolean v1, p0, Lcom/roidapp/photogrid/cloud/br;->u:Z

    if-nez v1, :cond_1

    .line 1202
    iput-boolean v2, p0, Lcom/roidapp/photogrid/cloud/br;->u:Z

    .line 1203
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->t:Lcom/facebook/CallbackManager;

    if-nez v1, :cond_5

    .line 1204
    invoke-static {}, Lcom/facebook/CallbackManager$Factory;->create()Lcom/facebook/CallbackManager;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->t:Lcom/facebook/CallbackManager;

    .line 1205
    invoke-static {}, Lcom/facebook/login/LoginManager;->getInstance()Lcom/facebook/login/LoginManager;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/br;->t:Lcom/facebook/CallbackManager;

    new-instance v3, Lcom/roidapp/photogrid/cloud/bv;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/cloud/bv;-><init>(Lcom/roidapp/photogrid/cloud/br;)V

    invoke-virtual {v1, v2, v3}, Lcom/facebook/login/LoginManager;->registerCallback(Lcom/facebook/CallbackManager;Lcom/facebook/FacebookCallback;)V

    .line 1226
    :cond_5
    :try_start_0
    invoke-static {}, Lcom/facebook/login/LoginManager;->getInstance()Lcom/facebook/login/LoginManager;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/facebook/login/LoginManager;->logInWithPublishPermissions(Landroid/app/Activity;Ljava/util/Collection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 1228
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 1229
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/br;->u:Z

    .line 1233
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/facebook/al;->a(Landroid/content/Context;)V

    goto :goto_2
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/br;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/view/ViewGroup;Ljava/util/Collection;)V
    .locals 10

    .prologue
    const/4 v3, 0x1

    const/4 v5, 0x0

    .line 84
    .line 10645
    invoke-interface {p4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v2, v3

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/p;

    .line 10646
    if-eqz v2, :cond_0

    move-object v4, p2

    .line 10647
    :goto_1
    const v1, 0x7f030026

    invoke-virtual {p1, v1, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 10648
    if-eqz v4, :cond_3

    if-eqz v1, :cond_3

    .line 10649
    iget v7, v0, Lcom/roidapp/photogrid/cloud/p;->a:I

    .line 10650
    iget-object v8, v0, Lcom/roidapp/photogrid/cloud/p;->c:Ljava/lang/String;

    .line 10651
    iget v9, v0, Lcom/roidapp/photogrid/cloud/p;->b:I

    .line 10652
    const v0, 0x7f0d00dc

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 10653
    if-eqz v0, :cond_3

    .line 10654
    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setId(I)V

    .line 10655
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10656
    invoke-virtual {v0, v9, v5, v5, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 10657
    iget-object v7, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10661
    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 10662
    if-nez v2, :cond_1

    move v0, v3

    :goto_2
    move v2, v0

    .line 10665
    goto :goto_0

    :cond_0
    move-object v4, p3

    .line 10646
    goto :goto_1

    :cond_1
    move v0, v5

    .line 10662
    goto :goto_2

    .line 84
    :cond_2
    return-void

    :cond_3
    move v0, v2

    goto :goto_2
.end method

.method public static a(Landroid/app/Activity;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Z
    .locals 12

    .prologue
    .line 93
    const/4 v10, 0x1

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move/from16 v9, p9

    move/from16 v11, p10

    invoke-static/range {v0 .. v11}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a(Landroid/app/Activity;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZI)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/br;JI)Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 84
    .line 11092
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->a:Landroid/widget/LinearLayout;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;

    .line 11093
    if-eqz v0, :cond_1

    .line 11094
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->a(I)V

    .line 11095
    invoke-virtual {v0, p3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->b(I)V

    .line 11096
    const/16 v2, 0x64

    if-ne p3, v2, :cond_0

    .line 11097
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/br;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    :cond_0
    move v0, v1

    .line 11099
    :goto_0
    return v0

    .line 11101
    :cond_1
    const/4 v0, 0x0

    .line 84
    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/cloud/br;)I
    .locals 1

    .prologue
    .line 84
    iget v0, p0, Lcom/roidapp/photogrid/cloud/br;->D:I

    return v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/cloud/br;I)I
    .locals 0

    .prologue
    .line 84
    iput p1, p0, Lcom/roidapp/photogrid/cloud/br;->C:I

    return p1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/cloud/br;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 84
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/cloud/br;->c(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lcom/roidapp/photogrid/cloud/br;I)I
    .locals 0

    .prologue
    .line 84
    iput p1, p0, Lcom/roidapp/photogrid/cloud/br;->v:I

    return p1
.end method

.method static synthetic c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    return-object v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 750
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "#"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->E:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/roidapp/baselib/c/n;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 751
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->A:Landroid/widget/CheckBox;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 752
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->A:Landroid/widget/CheckBox;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setTextColor(I)V

    .line 757
    :goto_0
    return-void

    .line 754
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->A:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 755
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->A:Landroid/widget/CheckBox;

    iget v1, p0, Lcom/roidapp/photogrid/cloud/br;->s:I

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setTextColor(I)V

    goto :goto_0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/CheckBox;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->A:Landroid/widget/CheckBox;

    return-object v0
.end method

.method private d(Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 925
    move v1, v2

    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 926
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->y:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 927
    const/4 v2, 0x1

    .line 930
    :cond_0
    return v2

    .line 925
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/cloud/br;)I
    .locals 1

    .prologue
    .line 84
    iget v0, p0, Lcom/roidapp/photogrid/cloud/br;->s:I

    return v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/EditText;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/cloud/br;)I
    .locals 1

    .prologue
    .line 84
    iget v0, p0, Lcom/roidapp/photogrid/cloud/br;->C:I

    return v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/CheckBox;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->z:Landroid/widget/CheckBox;

    return-object v0
.end method

.method static synthetic i(Lcom/roidapp/photogrid/cloud/br;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->E:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic j(Lcom/roidapp/photogrid/cloud/br;)V
    .locals 0

    .prologue
    .line 84
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/br;->n()V

    return-void
.end method

.method static synthetic k(Lcom/roidapp/photogrid/cloud/br;)J
    .locals 2

    .prologue
    .line 84
    iget-wide v0, p0, Lcom/roidapp/photogrid/cloud/br;->w:J

    return-wide v0
.end method

.method static synthetic l(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->l:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic m(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->m:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private m()Ljava/util/Collection;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lcom/roidapp/photogrid/cloud/p;",
            ">;"
        }
    .end annotation

    .prologue
    .line 584
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const-string v1, "share"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v7

    .line 586
    const/4 v0, 0x0

    .line 587
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-boolean v1, v1, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->j:Z

    if-eqz v1, :cond_2

    .line 588
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 590
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 591
    new-instance v3, Landroid/content/Intent;

    const-string v0, "android.intent.action.SEND"

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 593
    const-string v0, "video/mp4"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 594
    const/4 v0, 0x0

    .line 596
    const/4 v4, 0x0

    :try_start_0
    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 600
    :goto_0
    if-eqz v0, :cond_1

    .line 601
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 602
    iget-object v3, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    if-eqz v3, :cond_0

    .line 603
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 604
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 605
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    move-object v0, v1

    .line 611
    :cond_2
    new-instance v10, Ljava/util/TreeSet;

    invoke-direct {v10}, Ljava/util/TreeSet;-><init>()V

    .line 617
    new-instance v1, Lcom/roidapp/photogrid/cloud/p;

    const-string v2, "Messenger"

    const-wide/16 v4, 0x64

    const-wide/16 v8, 0x63

    invoke-interface {v7, v2, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    const v4, 0x7f02015b

    const/4 v5, -0x8

    const-string v6, "Messenger"

    invoke-direct/range {v1 .. v6}, Lcom/roidapp/photogrid/cloud/p;-><init>(JIILjava/lang/String;)V

    invoke-virtual {v10, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 619
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const-string v2, "com.whatsapp"

    invoke-static {v1, v2}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 620
    new-instance v1, Lcom/roidapp/photogrid/cloud/p;

    const-string v2, "Whatsapp"

    const-wide/16 v4, 0x63

    const-wide/16 v8, 0x62

    invoke-interface {v7, v2, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    const v4, 0x7f020196

    const/4 v5, -0x7

    const-string v6, "Whatsapp"

    invoke-direct/range {v1 .. v6}, Lcom/roidapp/photogrid/cloud/p;-><init>(JIILjava/lang/String;)V

    invoke-virtual {v10, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    :cond_3
    move-wide v2, v8

    .line 622
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const-string v4, "com.google.android.apps.plus"

    invoke-static {v1, v4}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 623
    new-instance v1, Lcom/roidapp/photogrid/cloud/p;

    const-string v4, "Google+"

    const-wide/16 v8, 0x1

    sub-long v8, v2, v8

    invoke-interface {v7, v4, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    const v4, 0x7f020162

    const/4 v5, -0x2

    const-string v6, "Google+"

    invoke-direct/range {v1 .. v6}, Lcom/roidapp/photogrid/cloud/p;-><init>(JIILjava/lang/String;)V

    invoke-virtual {v10, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    move-wide v2, v8

    .line 624
    :cond_4
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-boolean v1, v1, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->j:Z

    if-nez v1, :cond_5

    .line 625
    new-instance v1, Lcom/roidapp/photogrid/cloud/p;

    const-string v4, "Pinterest"

    const-wide/16 v8, 0x1

    sub-long v8, v2, v8

    invoke-interface {v7, v4, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    const v4, 0x7f020173

    const/4 v5, -0x6

    const-string v6, "Pinterest"

    invoke-direct/range {v1 .. v6}, Lcom/roidapp/photogrid/cloud/p;-><init>(JIILjava/lang/String;)V

    invoke-virtual {v10, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    move-wide v2, v8

    .line 626
    :cond_5
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const v4, 0x7f070140

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 627
    new-instance v1, Lcom/roidapp/photogrid/cloud/p;

    const-wide/16 v4, 0x1

    sub-long v8, v2, v4

    invoke-interface {v7, v6, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    const v4, 0x7f02016d

    const/4 v5, -0x3

    invoke-direct/range {v1 .. v6}, Lcom/roidapp/photogrid/cloud/p;-><init>(JIILjava/lang/String;)V

    invoke-virtual {v10, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 629
    const/4 v1, 0x0

    move-wide v2, v8

    :goto_2
    sget-object v4, Lcom/roidapp/photogrid/cloud/br;->e:[Lcom/roidapp/photogrid/cloud/p;

    array-length v4, v4

    if-ge v1, v4, :cond_8

    .line 630
    if-nez v0, :cond_7

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    sget-object v5, Lcom/roidapp/photogrid/cloud/br;->e:[Lcom/roidapp/photogrid/cloud/p;

    aget-object v5, v5, v1

    iget-object v5, v5, Lcom/roidapp/photogrid/cloud/p;->d:Ljava/lang/String;

    invoke-static {v4, v5}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 631
    :goto_3
    new-instance v6, Lcom/roidapp/photogrid/cloud/p;

    sget-object v4, Lcom/roidapp/photogrid/cloud/br;->e:[Lcom/roidapp/photogrid/cloud/p;

    aget-object v8, v4, v1

    sget-object v4, Lcom/roidapp/photogrid/cloud/br;->e:[Lcom/roidapp/photogrid/cloud/p;

    aget-object v4, v4, v1

    iget-object v9, v4, Lcom/roidapp/photogrid/cloud/p;->c:Ljava/lang/String;

    const-wide/16 v4, 0x1

    sub-long v4, v2, v4

    invoke-interface {v7, v9, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    invoke-direct {v6, v8, v2, v3, v1}, Lcom/roidapp/photogrid/cloud/p;-><init>(Lcom/roidapp/photogrid/cloud/p;JI)V

    invoke-virtual {v10, v6}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    move-wide v2, v4

    .line 629
    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 630
    :cond_7
    sget-object v4, Lcom/roidapp/photogrid/cloud/br;->e:[Lcom/roidapp/photogrid/cloud/p;

    aget-object v4, v4, v1

    iget-object v4, v4, Lcom/roidapp/photogrid/cloud/p;->d:Ljava/lang/String;

    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_3

    .line 635
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->j:Z

    if-nez v0, :cond_9

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_9

    invoke-static {}, Landroid/support/v4/print/PrintHelper;->systemSupportsPrint()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 636
    new-instance v1, Lcom/roidapp/photogrid/cloud/p;

    const-wide/16 v4, 0x1

    sub-long v8, v2, v4

    const v4, 0x7f020176

    const/4 v5, -0x5

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const v6, 0x7f0702b3

    invoke-virtual {v0, v6}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lcom/roidapp/photogrid/cloud/p;-><init>(JIILjava/lang/String;)V

    invoke-virtual {v10, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    move-wide v2, v8

    .line 638
    :cond_9
    new-instance v1, Lcom/roidapp/photogrid/cloud/p;

    const v4, 0x7f020180

    const/4 v5, -0x4

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const v6, 0x7f070216

    invoke-virtual {v0, v6}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lcom/roidapp/photogrid/cloud/p;-><init>(JIILjava/lang/String;)V

    invoke-virtual {v10, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 640
    return-object v10

    :catch_0
    move-exception v2

    goto/16 :goto_0
.end method

.method static synthetic n(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->n:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method private n()V
    .locals 12

    .prologue
    const-wide/16 v10, 0x1

    const/4 v5, 0x4

    .line 785
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 786
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/br;->e()Ljava/lang/String;

    move-result-object v4

    .line 787
    new-instance v2, Ljava/util/ArrayList;

    const/4 v0, 0x2

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 788
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-object v1, v1, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->l:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 789
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->j:Landroid/widget/CheckBox;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->j:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isSelected()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 790
    const-string v1, "twitter"

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 791
    const-string v1, "Twitter+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 792
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v1, v5, :cond_0

    .line 793
    const-string v1, "SendTwitter"

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->g()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/roidapp/baselib/c/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 796
    :cond_0
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-boolean v1, v1, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->j:Z

    if-eqz v1, :cond_3

    .line 797
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->k:Landroid/widget/RelativeLayout;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->isSelected()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 798
    const-string v1, "facebook"

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 799
    const-string v1, "Facebook+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 800
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v1, v5, :cond_1

    .line 801
    const-string v1, "SendFacebook"

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->g()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/roidapp/baselib/c/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 814
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-object v1, v1, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 816
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_4

    .line 817
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const v1, 0x7f0700d1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    .line 833
    :cond_2
    :goto_1
    return-void

    .line 805
    :cond_3
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->i:Landroid/widget/CheckBox;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->i:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isSelected()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 806
    const-string v1, "facebook"

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 807
    const-string v1, "Facebook+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 808
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v1, v5, :cond_1

    .line 809
    const-string v1, "SendFacebook"

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->g()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/roidapp/baselib/c/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 820
    :cond_4
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 9760
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 9763
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    .line 9764
    if-eqz v6, :cond_5

    .line 9766
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-object v1, v1, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-object v3, v3, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->h:Ljava/lang/String;

    const v5, 0x7f0702d7

    invoke-virtual {v6, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v6

    iget-object v6, v6, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    iget-object v7, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-object v7, v7, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->g:Ljava/lang/String;

    iget-object v8, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-object v8, v8, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->m:Ljava/lang/String;

    invoke-static/range {v0 .. v8}, Lcom/roidapp/cloudlib/upload/w;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)V

    .line 9767
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const v1, 0x7f0702c0

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    .line 824
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 825
    const-string v2, "SNS"

    const-string v3, "share_click"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Save/Share/"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v2, v3, v4}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 826
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const-string v3, "SNS"

    const-string v4, "share_click"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Save/Share/"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v2, v3, v4, v0, v5}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    goto :goto_2

    .line 831
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;)V

    goto/16 :goto_1
.end method

.method static synthetic o(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->o:Landroid/widget/TextView;

    return-object v0
.end method

.method private o()V
    .locals 12

    .prologue
    const/4 v6, 0x0

    const/16 v7, 0x8

    const-wide/16 v10, 0x1

    const/4 v1, 0x0

    .line 970
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const-string v2, "input_method"

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 971
    if-eqz v0, :cond_0

    .line 972
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 974
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 975
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-static {v0, v6}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;)V

    .line 1030
    :cond_1
    :goto_0
    return-void

    .line 9934
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 9935
    const-string v0, "history_tag"

    const-string v2, ""

    invoke-interface {v4, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 9936
    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 9937
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 9938
    array-length v0, v2

    add-int/lit8 v0, v0, -0x1

    :goto_1
    if-ltz v0, :cond_3

    .line 9939
    aget-object v5, v2, v0

    invoke-interface {v3, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 9938
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    .line 9947
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 9948
    invoke-static {v0, v6}, Lcom/roidapp/baselib/c/n;->a(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    move v0, v1

    .line 9949
    :goto_2
    array-length v5, v2

    if-ge v0, v5, :cond_6

    .line 9950
    aget-object v5, v2, v0

    invoke-direct {p0, v5}, Lcom/roidapp/photogrid/cloud/br;->d(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_5

    .line 9952
    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v5

    const/16 v6, 0x14

    if-lt v5, v6, :cond_4

    .line 9953
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 9955
    :cond_4
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "#"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v6, v2, v0

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 9949
    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 9958
    :cond_6
    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v3, v0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 9959
    const-string v2, ""

    .line 9960
    array-length v3, v0

    add-int/lit8 v3, v3, -0x1

    :goto_3
    if-ltz v3, :cond_8

    .line 9961
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget-object v5, v0, v3

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 9962
    if-lez v3, :cond_7

    .line 9963
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, ","

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 9960
    :cond_7
    add-int/lit8 v3, v3, -0x1

    goto :goto_3

    .line 9966
    :cond_8
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v3, "history_tag"

    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 981
    const-string v0, "SNS"

    const-string v2, "share_click"

    const-string v3, "Save/Share/SendPG"

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v2, v3}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 982
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const-string v2, "SNS"

    const-string v3, "share_click"

    const-string v4, "Save/Share/SendPG"

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v0, v2, v3, v4, v5}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 990
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v2, 0x4

    if-ne v0, v2, :cond_9

    .line 991
    const-string v0, "SendPG"

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->g()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/roidapp/baselib/c/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 994
    :cond_9
    sget v0, Lcom/roidapp/cloudlib/sns/upload/b;->e:I

    iput v0, p0, Lcom/roidapp/photogrid/cloud/br;->v:I

    .line 995
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/upload/e;->b()I

    .line 996
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/upload/e;->d()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 997
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 998
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->m:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 999
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->n:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v7}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1000
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->o:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const v3, 0x7f0700f9

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1001
    sget v0, Lcom/roidapp/cloudlib/sns/upload/b;->e:I

    iput v0, p0, Lcom/roidapp/photogrid/cloud/br;->v:I

    .line 1013
    :goto_4
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1014
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/br;->q:[Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/roidapp/baselib/c/n;->a(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 1015
    invoke-static {v2}, Lcom/roidapp/photogrid/cloud/br;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1016
    :goto_5
    array-length v4, v2

    if-ge v1, v4, :cond_b

    .line 1017
    const-string v4, "SNS"

    const-string v5, "hashtags_upload"

    aget-object v6, v2, v1

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v4, v5, v6}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1018
    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const-string v5, "SNS"

    const-string v6, "hashtags_upload"

    aget-object v7, v2, v1

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-static {v4, v5, v6, v7, v8}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 1016
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    .line 1003
    :cond_a
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1004
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->m:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1005
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->n:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1006
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->n:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 1007
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->m:Landroid/widget/RelativeLayout;

    const/4 v2, -0x1

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 1008
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->o:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const v3, 0x7f0700fa

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1009
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->o:Landroid/widget/TextView;

    invoke-static {v0, v1, v1, v1}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/TextView;III)Z

    goto :goto_4

    .line 1020
    :cond_b
    iget-wide v4, p0, Lcom/roidapp/photogrid/cloud/br;->w:J

    const-wide/16 v6, -0x1

    cmp-long v1, v4, v6

    if-nez v1, :cond_c

    .line 1021
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-object v2, v2, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->f:Ljava/lang/String;

    invoke-static {v1, v2, v3, v0}, Lcom/roidapp/cloudlib/sns/upload/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/photogrid/cloud/br;->w:J

    goto/16 :goto_0

    .line 1023
    :cond_c
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    iget-wide v2, p0, Lcom/roidapp/photogrid/cloud/br;->w:J

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/cloudlib/sns/upload/e;->a(J)Lcom/roidapp/cloudlib/sns/upload/i;

    move-result-object v0

    .line 1024
    if-eqz v0, :cond_1

    .line 1026
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v1

    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    invoke-virtual {v1, v2, v3}, Lcom/roidapp/cloudlib/sns/upload/e;->b(J)V

    .line 1027
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/sns/upload/e;->a(Landroid/content/Context;Lcom/roidapp/cloudlib/sns/upload/i;)V

    goto/16 :goto_0
.end method

.method private p()V
    .locals 3

    .prologue
    .line 1292
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->h:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 1293
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    rsub-int v0, v0, 0x8c

    .line 1294
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->h:Landroid/widget/TextView;

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1295
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->h:Landroid/widget/TextView;

    if-gez v0, :cond_1

    const/high16 v0, -0x120000

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1296
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->h:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 1297
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->h:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1299
    :cond_0
    return-void

    .line 1295
    :cond_1
    iget v0, p0, Lcom/roidapp/photogrid/cloud/br;->r:I

    goto :goto_0
.end method

.method static synthetic p(Lcom/roidapp/photogrid/cloud/br;)V
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 11261
    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->b()Lcom/facebook/AccessToken;

    move-result-object v2

    .line 11262
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-boolean v3, v3, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->j:Z

    if-eqz v3, :cond_2

    .line 11263
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/facebook/AccessToken;->isExpired()Z

    move-result v2

    if-nez v2, :cond_0

    sget-object v2, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->b:[Ljava/lang/String;

    invoke-static {v2}, Lcom/roidapp/cloudlib/facebook/al;->a([Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 11265
    :goto_0
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setSelected(Z)V

    .line 11266
    if-eqz v0, :cond_1

    .line 11267
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->k:Landroid/widget/RelativeLayout;

    const v1, 0x7f0200ef

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 11272
    :goto_1
    return-void

    :cond_0
    move v0, v1

    .line 11263
    goto :goto_0

    .line 11269
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->k:Landroid/widget/RelativeLayout;

    const v1, 0x7f0200ed

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    goto :goto_1

    .line 11274
    :cond_2
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/br;->i:Landroid/widget/CheckBox;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/facebook/AccessToken;->isExpired()Z

    move-result v2

    if-nez v2, :cond_3

    sget-object v2, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->c:[Ljava/lang/String;

    invoke-static {v2}, Lcom/roidapp/cloudlib/facebook/al;->a([Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    :goto_2
    invoke-virtual {v3, v0}, Landroid/widget/CheckBox;->setSelected(Z)V

    goto :goto_1

    :cond_3
    move v0, v1

    goto :goto_2
.end method

.method static synthetic q(Lcom/roidapp/photogrid/cloud/br;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->F:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic r(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/ce;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->B:Lcom/roidapp/photogrid/cloud/ce;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10

    .prologue
    const v9, 0x7f0d00c8

    const v8, 0x7f0d00c7

    const/4 v2, 0x1

    const/4 v1, 0x0

    const/16 v7, 0x8

    .line 202
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 203
    const v3, 0x7f030023

    invoke-virtual {v0, v3, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 2422
    const v0, 0x7f0d00ba

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->z:Landroid/widget/CheckBox;

    .line 2423
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->z:Landroid/widget/CheckBox;

    const v4, 0x7f020401

    invoke-virtual {v0, v4}, Landroid/widget/CheckBox;->setBackgroundResource(I)V

    .line 2424
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->z:Landroid/widget/CheckBox;

    invoke-virtual {v0, v2}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 2425
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->z:Landroid/widget/CheckBox;

    new-instance v4, Lcom/roidapp/photogrid/cloud/bz;

    invoke-direct {v4, p0}, Lcom/roidapp/photogrid/cloud/bz;-><init>(Lcom/roidapp/photogrid/cloud/br;)V

    invoke-virtual {v0, v4}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 2436
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->z:Landroid/widget/CheckBox;

    invoke-virtual {v0, v7}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 2437
    const-string v0, "#253034"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/cloud/br;->s:I

    .line 3349
    const v0, 0x7f0d00bd

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->b:Landroid/widget/RelativeLayout;

    .line 3350
    const v0, 0x7f0d00bf

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->A:Landroid/widget/CheckBox;

    .line 3351
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->A:Landroid/widget/CheckBox;

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 3352
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->A:Landroid/widget/CheckBox;

    iget v4, p0, Lcom/roidapp/photogrid/cloud/br;->s:I

    invoke-virtual {v0, v4}, Landroid/widget/CheckBox;->setTextColor(I)V

    .line 3353
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->A:Landroid/widget/CheckBox;

    new-instance v4, Lcom/roidapp/photogrid/cloud/bw;

    invoke-direct {v4, p0}, Lcom/roidapp/photogrid/cloud/bw;-><init>(Lcom/roidapp/photogrid/cloud/br;)V

    invoke-virtual {v0, v4}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 3369
    const v0, 0x7f0d00c0

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 3370
    new-instance v4, Lcom/roidapp/photogrid/cloud/bx;

    invoke-direct {v4, p0}, Lcom/roidapp/photogrid/cloud/bx;-><init>(Lcom/roidapp/photogrid/cloud/br;)V

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3396
    new-instance v0, Lcom/roidapp/photogrid/cloud/by;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/by;-><init>(Lcom/roidapp/photogrid/cloud/br;)V

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/q;->d(Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 3418
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 2440
    const v0, 0x7f0d00b5

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->a:Landroid/widget/LinearLayout;

    .line 2441
    const v0, 0x7f0d00cc

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->j:Landroid/widget/CheckBox;

    .line 2442
    const v0, 0x7f0d00ca

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->i:Landroid/widget/CheckBox;

    .line 2443
    const v0, 0x7f0d00c5

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->k:Landroid/widget/RelativeLayout;

    .line 2444
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->k:Landroid/widget/RelativeLayout;

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2445
    const v0, 0x7f0d00a8

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->l:Landroid/widget/RelativeLayout;

    .line 2446
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->l:Landroid/widget/RelativeLayout;

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2447
    const v0, 0x7f0d00c1

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->m:Landroid/widget/RelativeLayout;

    .line 2448
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->m:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2449
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->m:Landroid/widget/RelativeLayout;

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2450
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->j:Z

    if-eqz v0, :cond_0

    .line 2451
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2453
    :cond_0
    sget v0, Lcom/roidapp/cloudlib/sns/upload/b;->a:I

    iput v0, p0, Lcom/roidapp/photogrid/cloud/br;->v:I

    .line 2454
    const v0, 0x7f0d00c3

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->o:Landroid/widget/TextView;

    .line 2455
    const v0, 0x7f0d00c2

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->n:Landroid/widget/ProgressBar;

    .line 2456
    const v0, 0x7f0d00b8

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    .line 2457
    const v0, 0x7f0d00bb

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->h:Landroid/widget/TextView;

    .line 2458
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->h:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/cloud/br;->r:I

    .line 4306
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    new-instance v4, Lcom/roidapp/photogrid/cloud/bs;

    invoke-direct {v4, p0}, Lcom/roidapp/photogrid/cloud/bs;-><init>(Lcom/roidapp/photogrid/cloud/br;)V

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 4317
    const-string v0, ""

    .line 4318
    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-object v4, v4, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->i:Ljava/lang/String;

    if-eqz v4, :cond_1

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-object v4, v4, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->i:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 4319
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-object v4, v4, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->i:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 4324
    :cond_1
    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    invoke-virtual {v4, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 4325
    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 4326
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    new-array v4, v2, [Landroid/text/InputFilter;

    new-instance v5, Landroid/text/InputFilter$LengthFilter;

    const/16 v6, 0x1000

    invoke-direct {v5, v6}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v5, v4, v1

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 4327
    new-instance v0, Lcom/roidapp/photogrid/cloud/ce;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/photogrid/cloud/ce;-><init>(Lcom/roidapp/photogrid/cloud/br;B)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->B:Lcom/roidapp/photogrid/cloud/ce;

    .line 4328
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/br;->B:Lcom/roidapp/photogrid/cloud/ce;

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 2466
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v4, 0x4

    if-gt v0, v4, :cond_3

    move v2, v1

    move v0, v1

    .line 2475
    :cond_2
    :goto_0
    if-nez v0, :cond_4

    if-nez v2, :cond_4

    .line 2477
    invoke-virtual {v3, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 2478
    invoke-virtual {v3, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 2493
    :goto_1
    const v0, 0x7f0d00cd

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2494
    const v0, 0x7f0d00c4

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2500
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->j:Z

    if-eqz v0, :cond_7

    .line 2502
    const v0, 0x7f0d00cd

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 2505
    invoke-virtual {v3, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 2506
    invoke-virtual {v3, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 2507
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2514
    :goto_2
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/upload/e;->c()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/br;->a(Ljava/util/Collection;)V

    .line 2515
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->d:Lcom/roidapp/cloudlib/sns/upload/j;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/upload/e;->a(Lcom/roidapp/cloudlib/sns/upload/j;)V

    .line 205
    return-object v3

    .line 2469
    :cond_3
    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->d()Z

    move-result v0

    if-nez v0, :cond_8

    move v0, v1

    .line 2471
    :goto_3
    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-boolean v4, v4, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->j:Z

    if-eqz v4, :cond_2

    move v2, v1

    .line 2472
    goto :goto_0

    .line 2481
    :cond_4
    if-nez v0, :cond_5

    .line 2482
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->i:Landroid/widget/CheckBox;

    invoke-virtual {v0, v7}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 2483
    const v0, 0x7f0d00cb

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 2486
    :goto_4
    if-nez v2, :cond_6

    .line 2487
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->j:Landroid/widget/CheckBox;

    invoke-virtual {v0, v7}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 2488
    const v0, 0x7f0d00cb

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_1

    .line 2485
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->i:Landroid/widget/CheckBox;

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-virtual {v0, v4}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_4

    .line 2490
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->j:Landroid/widget/CheckBox;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-virtual {v0, v2}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_1

    .line 2510
    :cond_7
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2511
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->i:Landroid/widget/CheckBox;

    const v2, 0x7f020126

    invoke-static {v0, v2, v1, v1}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/TextView;III)Z

    goto :goto_2

    :cond_8
    move v0, v2

    goto :goto_3
.end method

.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 1329
    const-string v0, "Cloud/Share/%s/"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a()V
    .locals 2

    .prologue
    .line 181
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->j:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    sget-object v0, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;->b:[Ljava/lang/String;

    invoke-static {v0}, Lcom/roidapp/cloudlib/facebook/al;->a([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 186
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->k:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setSelected(Z)V

    .line 187
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->k:Landroid/widget/RelativeLayout;

    const v1, 0x7f0200ef

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 198
    :cond_0
    :goto_0
    return-void

    .line 193
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->k:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setSelected(Z)V

    .line 194
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->k:Landroid/widget/RelativeLayout;

    const v1, 0x7f0200ed

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    goto :goto_0
.end method

.method public final a(IILandroid/content/Intent;)V
    .locals 3

    .prologue
    const/16 v2, 0x8

    const/4 v1, 0x0

    .line 163
    packed-switch p1, :pswitch_data_0

    .line 171
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->t:Lcom/facebook/CallbackManager;

    if-eqz v0, :cond_0

    .line 172
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->t:Lcom/facebook/CallbackManager;

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/CallbackManager;->onActivityResult(IILandroid/content/Intent;)Z

    .line 174
    :cond_0
    iput-boolean v1, p0, Lcom/roidapp/photogrid/cloud/br;->u:Z

    .line 2282
    :cond_1
    :goto_0
    return-void

    .line 165
    :pswitch_0
    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->b()Lcom/facebook/AccessToken;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/cloud/br;->a(Lcom/facebook/AccessToken;)V

    goto :goto_0

    .line 2280
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/common/a;->p(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2281
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->j:Landroid/widget/CheckBox;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setSelected(Z)V

    .line 2282
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/br;->p()V

    goto :goto_0

    .line 2285
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->j:Landroid/widget/CheckBox;

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setSelected(Z)V

    .line 2286
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->h:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->h:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eq v0, v2, :cond_1

    .line 2287
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 163
    nop

    :pswitch_data_0
    .packed-switch 0xabc1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final a(Landroid/view/View;)V
    .locals 6

    .prologue
    const/high16 v5, 0x4000000

    const/16 v1, 0x8

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 520
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 8251
    :cond_0
    :goto_0
    :sswitch_0
    return-void

    .line 542
    :sswitch_1
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/br;->n()V

    goto :goto_0

    .line 5890
    :sswitch_2
    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->b()Lcom/facebook/AccessToken;

    move-result-object v0

    .line 5891
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/facebook/AccessToken;->isExpired()Z

    move-result v1

    if-nez v1, :cond_5

    .line 5892
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-boolean v1, v1, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->j:Z

    if-eqz v1, :cond_3

    .line 5893
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->isSelected()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 5894
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget v0, v0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->o:I

    sget v1, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->b:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 6839
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const-string v1, "SharePage/ShareToFB/VideoDialog"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 6840
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 6841
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    .line 6842
    invoke-virtual {v1, v3}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 6843
    invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V

    .line 6845
    :try_start_0
    invoke-virtual {v1}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const v2, 0x7f03009a

    invoke-virtual {v0, v2}, Landroid/view/Window;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6852
    const v0, 0x7f0d0270

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 6853
    new-instance v2, Lcom/roidapp/photogrid/cloud/cb;

    invoke-direct {v2, p0, v1}, Lcom/roidapp/photogrid/cloud/cb;-><init>(Lcom/roidapp/photogrid/cloud/br;Landroid/app/AlertDialog;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6864
    const v0, 0x7f0d0271

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 6865
    new-instance v2, Lcom/roidapp/photogrid/cloud/cc;

    invoke-direct {v2, p0, v1}, Lcom/roidapp/photogrid/cloud/cc;-><init>(Lcom/roidapp/photogrid/cloud/br;Landroid/app/AlertDialog;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6875
    const v0, 0x7f0d0272

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 6876
    new-instance v2, Lcom/roidapp/photogrid/cloud/cd;

    invoke-direct {v2, p0, v1}, Lcom/roidapp/photogrid/cloud/cd;-><init>(Lcom/roidapp/photogrid/cloud/br;Landroid/app/AlertDialog;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 6847
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 6848
    invoke-virtual {v1}, Landroid/app/AlertDialog;->dismiss()V

    goto/16 :goto_0

    .line 5897
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/br;->n()V

    goto/16 :goto_0

    .line 5900
    :cond_2
    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/cloud/br;->a(Lcom/facebook/AccessToken;)V

    goto/16 :goto_0

    .line 5904
    :cond_3
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->i:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isSelected()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 5905
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->i:Landroid/widget/CheckBox;

    invoke-virtual {v0, v3}, Landroid/widget/CheckBox;->setSelected(Z)V

    goto/16 :goto_0

    .line 5908
    :cond_4
    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/cloud/br;->a(Lcom/facebook/AccessToken;)V

    goto/16 :goto_0

    .line 7772
    :cond_5
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const-class v2, Lcom/roidapp/cloudlib/facebook/FbLoginActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 7774
    invoke-virtual {v0, v5}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 7775
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const v2, 0xabc1

    invoke-virtual {v1, v0, v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto/16 :goto_0

    .line 8244
    :sswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/common/a;->p(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 8779
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const-class v2, Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 8780
    invoke-virtual {v0, v5}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 8781
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const v2, 0xabc2

    invoke-virtual {v1, v0, v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto/16 :goto_0

    .line 8248
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->j:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isSelected()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 8249
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->j:Landroid/widget/CheckBox;

    invoke-virtual {v0, v3}, Landroid/widget/CheckBox;->setSelected(Z)V

    .line 8250
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->h:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->h:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_0

    .line 8251
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_0

    .line 8254
    :cond_7
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->j:Landroid/widget/CheckBox;

    invoke-virtual {v0, v4}, Landroid/widget/CheckBox;->setSelected(Z)V

    .line 8255
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/br;->p()V

    goto/16 :goto_0

    .line 554
    :sswitch_4
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 555
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/br;->o()V

    goto/16 :goto_0

    .line 557
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->q:Z

    if-nez v0, :cond_0

    .line 558
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    new-instance v1, Lcom/roidapp/photogrid/cloud/ca;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/cloud/ca;-><init>(Lcom/roidapp/photogrid/cloud/br;)V

    const-string v2, "Share_Finish_Page"

    invoke-static {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/app/Activity;Lcom/roidapp/cloudlib/sns/aj;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 569
    :sswitch_5
    iget v0, p0, Lcom/roidapp/photogrid/cloud/br;->v:I

    sget v1, Lcom/roidapp/cloudlib/sns/upload/b;->c:I

    if-ne v0, v1, :cond_9

    .line 8916
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const v1, 0x8809

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->setResult(I)V

    .line 8917
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->finish()V

    .line 8918
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const-class v2, Lcom/roidapp/photogrid/MainPage;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 8919
    const-string v1, "jump_from_sharepage"

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 8920
    sput-boolean v3, Lcom/roidapp/photogrid/common/az;->s:Z

    .line 8921
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 572
    :cond_9
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/upload/e;->b()I

    move-result v0

    .line 573
    if-lez v0, :cond_a

    .line 574
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const v2, 0x7f0700f9

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 576
    :cond_a
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const-string v1, "Uploading now, please wait..."

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 520
    :sswitch_data_0
    .sparse-switch
        0x7f0d00a8 -> :sswitch_4
        0x7f0d00ba -> :sswitch_0
        0x7f0d00c1 -> :sswitch_5
        0x7f0d00c5 -> :sswitch_2
        0x7f0d00ca -> :sswitch_2
        0x7f0d00cc -> :sswitch_3
        0x7f0d00cd -> :sswitch_1
    .end sparse-switch
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 340
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "@"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 341
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "@"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 342
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getSelectionStart()I

    move-result v2

    .line 343
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    sub-int v4, v2, v4

    const/4 v5, 0x0

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-interface {v3, v4, v2, v1}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 344
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int v0, v2, v0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->length()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v3, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 345
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->B:Lcom/roidapp/photogrid/cloud/ce;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/ce;->a()V

    .line 346
    return-void
.end method

.method public final a(Ljava/lang/String;Z)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v2, 0x0

    .line 700
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->B:Lcom/roidapp/photogrid/cloud/ce;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/ce;->a()V

    .line 701
    if-eqz p2, :cond_6

    .line 703
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->x:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 704
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 705
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 706
    array-length v3, v0

    if-eq v3, v5, :cond_0

    array-length v3, v0

    if-nez v3, :cond_1

    .line 707
    :cond_0
    invoke-virtual {v1, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 709
    :cond_1
    array-length v3, v0

    if-le v3, v5, :cond_4

    .line 710
    const-string v1, ""

    .line 711
    aget-object v3, v0, v2

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 712
    aget-object v1, v0, v2

    .line 713
    :cond_2
    aget-object v3, v0, v5

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 714
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v3, v0, v5

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 715
    :cond_3
    aget-object v0, v0, v2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    .line 725
    :goto_0
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    invoke-virtual {v2, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 726
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->length()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 741
    :goto_1
    return-void

    .line 716
    :cond_4
    array-length v3, v0

    if-ne v3, v5, :cond_5

    .line 717
    aget-object v3, v0, v2

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_7

    .line 718
    aget-object v1, v0, v2

    .line 719
    aget-object v0, v0, v2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    goto :goto_0

    .line 721
    :cond_5
    array-length v0, v0

    if-nez v0, :cond_7

    .line 722
    const-string v1, ""

    move v0, v2

    goto :goto_0

    .line 728
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->x:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 729
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getSelectionStart()I

    move-result v0

    .line 730
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 731
    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 732
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v1, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 734
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 735
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 736
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    invoke-virtual {v2, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 737
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v0, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-interface {v2}, Landroid/text/Editable;->length()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setSelection(I)V

    goto/16 :goto_1

    :cond_7
    move v0, v2

    goto/16 :goto_0
.end method

.method public final a(Ljava/util/Collection;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/roidapp/cloudlib/sns/upload/i;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/16 v9, 0x8

    const/4 v8, 0x0

    .line 1140
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 1141
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1142
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/upload/i;

    .line 1143
    iget-wide v4, v0, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    .line 1144
    iget-byte v3, v0, Lcom/roidapp/cloudlib/sns/upload/i;->f:B

    .line 1145
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->a:Landroid/widget/LinearLayout;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;

    .line 1146
    iget-wide v6, p0, Lcom/roidapp/photogrid/cloud/br;->w:J

    cmp-long v6, v4, v6

    if-nez v6, :cond_2

    .line 1147
    const/4 v0, 0x2

    if-ne v3, v0, :cond_1

    .line 1148
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v8}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1149
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->m:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v9}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1150
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->n:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v8}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 1151
    iget v0, p0, Lcom/roidapp/photogrid/cloud/br;->v:I

    sget v1, Lcom/roidapp/cloudlib/sns/upload/b;->d:I

    if-eq v0, v1, :cond_0

    .line 1152
    sget v0, Lcom/roidapp/cloudlib/sns/upload/b;->d:I

    iput v0, p0, Lcom/roidapp/photogrid/cloud/br;->v:I

    .line 1153
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const v3, 0x7f0700c0

    invoke-virtual {v1, v3}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 1156
    :cond_1
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/upload/e;->b()I

    move-result v0

    .line 1157
    if-nez v0, :cond_0

    .line 1158
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const v3, 0x7f0700fa

    invoke-virtual {v1, v3}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1159
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v9}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1160
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->m:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v8}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1161
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->n:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v8}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0

    .line 1167
    :cond_2
    if-nez v1, :cond_3

    .line 10105
    new-instance v1, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;

    iget-object v6, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-direct {v1, v6}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;-><init>(Landroid/content/Context;)V

    .line 10106
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->setTag(Ljava/lang/Object;)V

    .line 10107
    invoke-virtual {v1, v3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->a(I)V

    .line 10108
    iget v3, v0, Lcom/roidapp/cloudlib/sns/upload/i;->d:I

    invoke-virtual {v1, v3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->b(I)V

    .line 10109
    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/upload/i;->a:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->a(Ljava/lang/String;)V

    .line 10110
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x1

    const/4 v5, -0x2

    invoke-direct {v3, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 10111
    const/16 v4, 0x14

    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 10112
    invoke-virtual {v1, v3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 10113
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/br;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 10114
    new-instance v3, Lcom/roidapp/photogrid/cloud/bu;

    invoke-direct {v3, p0, v1, v0}, Lcom/roidapp/photogrid/cloud/bu;-><init>(Lcom/roidapp/photogrid/cloud/br;Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;Lcom/roidapp/cloudlib/sns/upload/i;)V

    invoke-virtual {v1, v3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->a(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 1170
    :cond_3
    invoke-virtual {v1, v3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->a(I)V

    .line 1171
    iget v0, v0, Lcom/roidapp/cloudlib/sns/upload/i;->d:I

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->b(I)V

    goto/16 :goto_0

    .line 1177
    :cond_4
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 669
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->y:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 670
    return-void
.end method

.method public final b()[Lcom/roidapp/photogrid/cloud/a/l;
    .locals 5

    .prologue
    .line 210
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/roidapp/photogrid/cloud/a/l;

    const/4 v1, 0x0

    new-instance v2, Lcom/roidapp/photogrid/cloud/cf;

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/br;->f:Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    invoke-direct {v2, p0, v3, v4}, Lcom/roidapp/photogrid/cloud/cf;-><init>(Lcom/roidapp/photogrid/cloud/br;Landroid/content/Context;Lcom/roidapp/photogrid/cloud/a/t;)V

    aput-object v2, v0, v1

    return-object v0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 254
    const v0, 0x7f0d00a1

    return v0
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 259
    const v0, 0x7f070228

    return v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 264
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 265
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 266
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public final f()Z
    .locals 1

    .prologue
    .line 1334
    const/4 v0, 0x1

    return v0
.end method

.method public final g()V
    .locals 2

    .prologue
    .line 1346
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->d:Lcom/roidapp/cloudlib/sns/upload/j;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/upload/e;->b(Lcom/roidapp/cloudlib/sns/upload/j;)V

    .line 1347
    return-void
.end method

.method public final h()V
    .locals 1

    .prologue
    .line 332
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/photogrid/cloud/br;->D:I

    .line 333
    return-void
.end method

.method public final i()V
    .locals 1

    .prologue
    .line 336
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/photogrid/cloud/br;->C:I

    .line 337
    return-void
.end method

.method public final j()V
    .locals 1

    .prologue
    .line 673
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 674
    return-void
.end method

.method public final k()Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 677
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 678
    const-string v1, "#\\w+"

    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    .line 679
    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 680
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/br;->x:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 681
    :goto_0
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 682
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v1

    .line 683
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/br;->x:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 685
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->x:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final l()V
    .locals 2

    .prologue
    .line 744
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->z:Landroid/widget/CheckBox;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 745
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->z:Landroid/widget/CheckBox;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 746
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/br;->g:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/cloud/br;->c(Ljava/lang/String;)V

    .line 747
    return-void
.end method
