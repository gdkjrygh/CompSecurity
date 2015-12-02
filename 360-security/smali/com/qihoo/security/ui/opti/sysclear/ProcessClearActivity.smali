.class public Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;,
        Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;
    }
.end annotation


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field private A:Landroid/content/Context;

.field private B:Landroid/content/pm/PackageManager;

.field private C:Landroid/widget/ExpandableListView;

.field private D:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

.field private E:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private F:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private G:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private H:Landroid/view/View;

.field private I:Landroid/view/View;

.field private J:Landroid/view/View;

.field private K:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private L:Landroid/view/View;

.field private M:I

.field private N:I

.field private O:J

.field private P:Lcom/qihoo360/mobilesafe/core/c/c;

.field private Q:Lcom/qihoo360/mobilesafe/b/g;

.field private R:Lcom/qihoo/security/a/a/a;

.field private S:I

.field private final T:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final U:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private V:Z

.field private W:Z

.field private X:Z

.field private Y:Landroid/view/LayoutInflater;

.field private Z:Z

.field private aa:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private ab:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private ac:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private ad:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

.field private ae:I

.field private af:I

.field private ag:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;"
        }
    .end annotation
.end field

.field private ah:Z

.field private ai:Z

.field private final aj:Landroid/content/ServiceConnection;

.field private final ak:Lcom/qihoo360/mobilesafe/core/c/b;

.field private final al:I

.field private final am:I

.field y:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 94
    const-class v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->z:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 91
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    .line 99
    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->A:Landroid/content/Context;

    .line 119
    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    .line 120
    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->Q:Lcom/qihoo360/mobilesafe/b/g;

    .line 130
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->T:Ljava/util/HashMap;

    .line 132
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->U:Ljava/util/HashSet;

    .line 159
    iput-boolean v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->ah:Z

    .line 834
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$6;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$6;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->aj:Landroid/content/ServiceConnection;

    .line 897
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->ak:Lcom/qihoo360/mobilesafe/core/c/b;

    .line 981
    iput v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->al:I

    .line 983
    const/4 v0, 0x2

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->am:I

    .line 984
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$8;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$8;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->y:Landroid/os/Handler;

    .line 2207
    return-void
.end method

.method private a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I
    .locals 2

    .prologue
    .line 303
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-ne p1, v0, :cond_0

    .line 304
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080058

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 308
    :goto_0
    return v0

    .line 305
    :cond_0
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->NEED_OPTIMIZE:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-ne p1, v0, :cond_1

    .line 306
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080057

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    goto :goto_0

    .line 308
    :cond_1
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080056

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;I)I
    .locals 0

    .prologue
    .line 91
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->N:I

    return p1
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;Landroid/view/View;)Landroid/view/View;
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->L:Landroid/view/View;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;Lcom/qihoo360/mobilesafe/core/c/c;)Lcom/qihoo360/mobilesafe/core/c/c;
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    return-object p1
.end method

.method private a(Lcom/qihoo360/mobilesafe/service/ProcessInfo;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 1167
    const-string/jumbo v0, ""

    .line 1169
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->B:Landroid/content/pm/PackageManager;

    iget-object v2, p1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    const/16 v3, 0x80

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    .line 1172
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->B:Landroid/content/pm/PackageManager;

    invoke-virtual {v1, v2}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v1

    .line 1173
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1174
    iget-object v0, p1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    .line 1183
    :cond_0
    :goto_0
    return-object v0

    .line 1176
    :cond_1
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 1178
    :catch_0
    move-exception v1

    .line 1179
    iget-object v1, p1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1180
    iget-object v0, p1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    goto :goto_0
.end method

.method private a(II)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1236
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->y:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 1237
    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 1238
    iput p2, v0, Landroid/os/Message;->arg2:I

    .line 1239
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1240
    iput v2, v0, Landroid/os/Message;->what:I

    .line 1241
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->y:Landroid/os/Handler;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 1242
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->y:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1243
    return-void
.end method

.method private a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo/security/opti/a/a$a;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1090
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1092
    :try_start_0
    iget-object v0, p1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->a:Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/a/a$a;

    .line 1093
    if-eqz v0, :cond_0

    .line 1094
    invoke-virtual {v0}, Lcom/qihoo/security/opti/a/a$a;->a()I

    move-result v0

    iput v0, p1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->j:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1102
    :cond_0
    :goto_0
    return-void

    .line 1096
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;II)V
    .locals 0

    .prologue
    .line 91
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(II)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;ZII)V
    .locals 0

    .prologue
    .line 91
    invoke-direct {p0, p1, p2, p3}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(ZII)V

    return-void
.end method

.method private a(Ljava/util/List;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo/security/opti/a/a$a;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/16 v2, 0x8

    const/4 v1, 0x0

    .line 1066
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->I:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1067
    iget-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->V:Z

    if-nez v0, :cond_0

    .line 1068
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->V:Z

    .line 1069
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1070
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->H:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1071
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->C:Landroid/widget/ExpandableListView;

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setVisibility(I)V

    .line 1072
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->b(Ljava/util/List;Ljava/util/Map;)V

    .line 1073
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->C:Landroid/widget/ExpandableListView;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setAdapter(Landroid/widget/ExpandableListAdapter;)V

    .line 1074
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    if-eqz v0, :cond_0

    .line 1075
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->c()V

    .line 1086
    :cond_0
    :goto_0
    return-void

    .line 1078
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    if-eqz v0, :cond_2

    .line 1079
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a()V

    .line 1081
    :cond_2
    invoke-direct {p0, v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->d(I)V

    .line 1082
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->C:Landroid/widget/ExpandableListView;

    invoke-virtual {v0, v2}, Landroid/widget/ExpandableListView;->setVisibility(I)V

    .line 1083
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->H:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method private a(ZII)V
    .locals 0

    .prologue
    .line 1198
    invoke-direct {p0, p3, p2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(II)V

    .line 1201
    if-eqz p1, :cond_0

    .line 1202
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->o()V

    .line 1204
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;Z)Z
    .locals 0

    .prologue
    .line 91
    iput-boolean p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->Z:Z

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;I)I
    .locals 0

    .prologue
    .line 91
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->M:I

    return p1
.end method

.method private b(Ljava/util/List;Ljava/util/Map;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo/security/opti/a/a$a;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1106
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput v2, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->S:I

    .line 1108
    if-eqz p1, :cond_8

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_8

    .line 1109
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 1110
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 1111
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 1113
    const/4 v3, 0x0

    .line 1114
    const/4 v2, 0x0

    .line 1115
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    move v11, v2

    move v12, v3

    :cond_0
    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lcom/qihoo360/mobilesafe/service/ProcessInfo;

    .line 1116
    move-object/from16 v0, p0

    invoke-direct {v0, v9}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo360/mobilesafe/service/ProcessInfo;)Ljava/lang/String;

    move-result-object v4

    .line 1117
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->T:Ljava/util/HashMap;

    invoke-virtual {v2, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1121
    new-instance v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    iget-object v3, v9, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    iget v5, v9, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->useMemory:I

    iget-boolean v6, v9, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->isSystem:Z

    const/4 v7, 0x0

    iget v8, v9, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->flag:I

    const/4 v10, 0x3

    if-ne v8, v10, :cond_1

    const/4 v8, 0x1

    :goto_1
    iget-object v9, v9, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->pids:[I

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v10}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;-><init>(Ljava/lang/String;Ljava/lang/String;IZZZ[II)V

    .line 1125
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v2, v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;Ljava/util/Map;)V

    .line 1126
    iget-boolean v3, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->h:Z

    if-nez v3, :cond_3

    .line 1127
    iget v4, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    .line 1128
    add-int v3, v12, v4

    .line 1130
    iget-boolean v5, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->e:Z

    if-eqz v5, :cond_2

    .line 1131
    add-int/2addr v11, v4

    .line 1132
    invoke-interface {v13, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2
    move v2, v11

    :goto_3
    move v11, v2

    move v12, v3

    .line 1139
    goto :goto_0

    .line 1121
    :cond_1
    const/4 v8, 0x0

    goto :goto_1

    .line 1134
    :cond_2
    invoke-interface {v14, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 1137
    :cond_3
    invoke-interface {v15, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v2, v11

    move v3, v12

    goto :goto_3

    .line 1140
    :cond_4
    if-eqz v14, :cond_5

    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    .line 1142
    invoke-static {v14}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 1144
    :cond_5
    if-eqz v13, :cond_6

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    .line 1147
    invoke-static {v13}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 1149
    :cond_6
    if-eqz v15, :cond_7

    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_7

    .line 1151
    invoke-static {v15}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 1153
    :cond_7
    move-object/from16 v0, p0

    iput v12, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->S:I

    .line 1155
    new-instance v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    move-object/from16 v0, p0

    invoke-direct {v2, v0, v13, v14, v15}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    .line 1158
    :cond_8
    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Z
    .locals 1

    .prologue
    .line 91
    iget-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->Z:Z

    return v0
.end method

.method static synthetic b(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;Z)Z
    .locals 0

    .prologue
    .line 91
    iput-boolean p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->X:Z

    return p1
.end method

.method static synthetic c(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)I
    .locals 1

    .prologue
    .line 91
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->N:I

    return v0
.end method

.method static synthetic c(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;I)I
    .locals 0

    .prologue
    .line 91
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->S:I

    return p1
.end method

.method private c(Landroid/content/Intent;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 192
    if-eqz p1, :cond_0

    .line 193
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->A:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 194
    const-string/jumbo v0, "from_notify"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->ai:Z

    .line 198
    :cond_0
    invoke-static {}, Lcom/qihoo/security/ui/result/f;->a()Lcom/qihoo/security/ui/result/f;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/result/f;->a(I)V

    .line 200
    return-void
.end method

.method private c(Z)V
    .locals 12

    .prologue
    const/4 v1, 0x1

    const/4 v3, -0x1

    const/4 v0, 0x0

    .line 700
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->r()I

    move-result v6

    .line 702
    if-nez p1, :cond_2

    if-gtz v6, :cond_2

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->U:Ljava/util/HashSet;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->U:Ljava/util/HashSet;

    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_0
    iget-boolean v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->W:Z

    if-nez v2, :cond_2

    .line 708
    iput-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->ah:Z

    .line 709
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->finish()V

    .line 773
    :cond_1
    :goto_0
    return-void

    .line 711
    :cond_2
    iput-boolean v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->ah:Z

    .line 712
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 713
    if-eqz v7, :cond_1

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    if-eqz v2, :cond_1

    .line 718
    if-eqz p1, :cond_6

    .line 719
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-virtual {v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->e()Z

    move-result v5

    .line 720
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-virtual {v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->k()[I

    move-result-object v4

    .line 723
    aget v2, v4, v0

    .line 725
    aget v4, v4, v1

    .line 726
    iget v8, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->S:I

    add-int/2addr v6, v8

    .line 728
    iput-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->W:Z

    .line 734
    :goto_1
    if-nez v5, :cond_3

    if-eqz p1, :cond_4

    :cond_3
    move v0, v1

    .line 737
    :cond_4
    iget-wide v8, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->O:J

    int-to-long v10, v6

    add-long/2addr v8, v10

    .line 738
    if-eqz v5, :cond_5

    .line 739
    sget-object v1, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->ad:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 752
    :cond_5
    const-string/jumbo v1, "is_need_read"

    iget-boolean v10, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->W:Z

    invoke-virtual {v7, v1, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 753
    const-string/jumbo v1, "is_best_fade"

    invoke-virtual {v7, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 754
    const-string/jumbo v0, "is_best"

    invoke-virtual {v7, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 755
    const-string/jumbo v0, "extra_killed_memory"

    invoke-virtual {v7, v0, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 757
    const-string/jumbo v0, "free_memory_kb"

    invoke-virtual {v7, v0, v8, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 759
    const-string/jumbo v0, "exam_status"

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->ad:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 760
    const-string/jumbo v0, "kill_prower_count"

    invoke-virtual {v7, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 762
    const-string/jumbo v0, "kill_process_count"

    invoke-virtual {v7, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 764
    invoke-virtual {p0, v3, v7}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->setResult(ILandroid/content/Intent;)V

    .line 767
    const/16 v0, 0x2b09

    div-int/lit16 v1, v6, 0x400

    invoke-static {v0, v1}, Lcom/qihoo/security/support/b;->b(II)V

    .line 770
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->finish()V

    goto :goto_0

    .line 729
    :cond_6
    if-lez v6, :cond_7

    .line 730
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-virtual {v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->f()Z

    move-result v5

    .line 731
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-virtual {v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->j()I

    move-result v4

    .line 732
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-virtual {v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->i()I

    move-result v2

    goto :goto_1

    :cond_7
    move v2, v3

    move v4, v3

    move v5, v0

    goto :goto_1
.end method

.method static synthetic c(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;Z)Z
    .locals 0

    .prologue
    .line 91
    iput-boolean p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->W:Z

    return p1
.end method

.method static synthetic d(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)I
    .locals 1

    .prologue
    .line 91
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->M:I

    return v0
.end method

.method private d(I)V
    .locals 9

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 1207
    const-string/jumbo v0, ""

    .line 1208
    const-string/jumbo v1, ""

    .line 1209
    int-to-long v2, p1

    const-wide/16 v4, 0x400

    mul-long/2addr v2, v4

    .line 1210
    long-to-float v2, v2

    invoke-static {v2}, Lcom/qihoo360/mobilesafe/b/s;->b(F)[Ljava/lang/String;

    move-result-object v2

    .line 1212
    if-eqz v2, :cond_1

    .line 1213
    aget-object v3, v2, v6

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 1214
    aget-object v0, v2, v6

    .line 1216
    :cond_0
    aget-object v3, v2, v7

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 1217
    aget-object v1, v2, v7

    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    .line 1220
    :goto_0
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->E:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v2, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 1221
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->F:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 1222
    return-void

    :cond_1
    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    goto :goto_0
.end method

.method static synthetic d(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;I)V
    .locals 0

    .prologue
    .line 91
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->d(I)V

    return-void
.end method

.method static synthetic d(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;Z)V
    .locals 0

    .prologue
    .line 91
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->c(Z)V

    return-void
.end method

.method static synthetic e(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;I)I
    .locals 1

    .prologue
    .line 91
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->S:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->S:I

    return v0
.end method

.method static synthetic e(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Landroid/view/View;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->L:Landroid/view/View;

    return-object v0
.end method

.method static synthetic f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)I
    .locals 1

    .prologue
    .line 91
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->S:I

    return v0
.end method

.method static synthetic f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;I)I
    .locals 1

    .prologue
    .line 91
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->S:I

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->S:I

    return v0
.end method

.method static synthetic g(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->T:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic h(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Lcom/qihoo360/mobilesafe/core/c/c;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    return-object v0
.end method

.method static synthetic i(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Lcom/qihoo360/mobilesafe/core/c/b;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->ak:Lcom/qihoo360/mobilesafe/core/c/b;

    return-object v0
.end method

.method static synthetic j(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Landroid/view/View;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->H:Landroid/view/View;

    return-object v0
.end method

.method static synthetic k(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Landroid/view/View;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->I:Landroid/view/View;

    return-object v0
.end method

.method static synthetic l(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Z
    .locals 1

    .prologue
    .line 91
    iget-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->X:Z

    return v0
.end method

.method static synthetic m(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Landroid/widget/ExpandableListView;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->C:Landroid/widget/ExpandableListView;

    return-object v0
.end method

.method static synthetic n(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Lcom/qihoo/security/a/a/a;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->R:Lcom/qihoo/security/a/a/a;

    return-object v0
.end method

.method static synthetic o(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Z
    .locals 1

    .prologue
    .line 91
    iget-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->ai:Z

    return v0
.end method

.method static synthetic p(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Landroid/view/LayoutInflater;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->Y:Landroid/view/LayoutInflater;

    return-object v0
.end method

.method private p()V
    .locals 4

    .prologue
    const-wide/16 v2, -0x1

    .line 203
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 204
    const-string/jumbo v1, "free_memory_kb"

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    .line 206
    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    .line 207
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->d()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->O:J

    .line 217
    :goto_0
    return-void

    .line 212
    :cond_0
    iput-wide v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->O:J

    goto :goto_0
.end method

.method static synthetic q(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->A:Landroid/content/Context;

    return-object v0
.end method

.method private q()V
    .locals 10

    .prologue
    const/4 v9, 0x0

    const/16 v3, 0x30

    const/4 v2, 0x3

    const/4 v8, 0x0

    .line 220
    const-string/jumbo v0, "layout_inflater"

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->Y:Landroid/view/LayoutInflater;

    .line 221
    new-instance v0, Lcom/qihoo360/mobilesafe/b/g;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->A:Landroid/content/Context;

    invoke-direct {v0, v1, v3, v3}, Lcom/qihoo360/mobilesafe/b/g;-><init>(Landroid/content/Context;II)V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->Q:Lcom/qihoo360/mobilesafe/b/g;

    .line 222
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->A:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->Y:Landroid/view/LayoutInflater;

    .line 224
    const v0, 0x7f0b009b

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->I:Landroid/view/View;

    .line 225
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->I:Landroid/view/View;

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 227
    const v0, 0x7f0b01ac

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->H:Landroid/view/View;

    .line 228
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->H:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 230
    const v0, 0x7f0b00eb

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->J:Landroid/view/View;

    .line 231
    const v0, 0x7f0b0146

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ExpandableListView;

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->C:Landroid/widget/ExpandableListView;

    .line 232
    const v0, 0x7f0b01a9

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->E:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 234
    const v0, 0x7f0b01aa

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->F:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 235
    const v0, 0x7f0b01a8

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->G:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 236
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->G:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->o:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c001d

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->c()J

    move-result-wide v6

    invoke-virtual {p0, v6, v7}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(J)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v8

    invoke-virtual {v1, v3, v4}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 242
    const v0, 0x7f0b00f6

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->K:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 243
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->K:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c0017

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 244
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->K:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 245
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->C:Landroid/widget/ExpandableListView;

    invoke-virtual {v0, v9}, Landroid/widget/ExpandableListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 246
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->C:Landroid/widget/ExpandableListView;

    invoke-virtual {v0, v9}, Landroid/widget/ExpandableListView;->setGroupIndicator(Landroid/graphics/drawable/Drawable;)V

    .line 247
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->C:Landroid/widget/ExpandableListView;

    new-instance v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$1;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setOnGroupClickListener(Landroid/widget/ExpandableListView$OnGroupClickListener;)V

    .line 268
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->C:Landroid/widget/ExpandableListView;

    new-instance v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$2;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setOnChildClickListener(Landroid/widget/ExpandableListView$OnChildClickListener;)V

    .line 288
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 289
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 290
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->ae:I

    .line 291
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->af:I

    .line 296
    new-instance v1, Lcom/qihoo/security/a/a/a;

    const-wide/16 v4, 0x78

    iget v6, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->ae:I

    iget v7, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->af:I

    move v3, v2

    invoke-direct/range {v1 .. v7}, Lcom/qihoo/security/a/a/a;-><init>(IIJII)V

    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->R:Lcom/qihoo/security/a/a/a;

    .line 300
    return-void
.end method

.method private r()I
    .locals 3

    .prologue
    .line 776
    const/4 v0, 0x0

    .line 777
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->T:Ljava/util/HashMap;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->T:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 778
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->T:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    .line 780
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 781
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 782
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 783
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/2addr v0, v1

    move v1, v0

    .line 784
    goto :goto_0

    :cond_0
    move v0, v1

    .line 786
    :cond_1
    return v0
.end method

.method static synthetic r(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Lcom/qihoo360/mobilesafe/b/g;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->Q:Lcom/qihoo360/mobilesafe/b/g;

    return-object v0
.end method

.method static synthetic s(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)I
    .locals 1

    .prologue
    .line 91
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->ae:I

    return v0
.end method

.method private s()V
    .locals 1

    .prologue
    .line 793
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 794
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->c(Z)V

    .line 796
    :cond_0
    return-void
.end method

.method static synthetic t(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)I
    .locals 1

    .prologue
    .line 91
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->af:I

    return v0
.end method

.method static synthetic u(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Ljava/util/List;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->ag:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a(J)Ljava/lang/String;
    .locals 3

    .prologue
    .line 1225
    const-wide/16 v0, 0x400

    mul-long/2addr v0, p1

    long-to-float v0, v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/s;->a(F)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1046
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->ag:Ljava/util/List;

    .line 1047
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1048
    invoke-static {p1}, Lcom/qihoo/security/opti/a/a;->a(Ljava/util/List;)Ljava/util/Map;

    move-result-object v0

    .line 1050
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1051
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->ag:Ljava/util/List;

    invoke-direct {p0, v1, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Ljava/util/List;Ljava/util/Map;)V

    .line 1056
    :cond_0
    :goto_0
    return-void

    .line 1054
    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Ljava/util/List;Ljava/util/Map;)V

    goto :goto_0
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 952
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    if-eqz v0, :cond_0

    .line 954
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->U:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 955
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    const/4 v1, 0x1

    invoke-interface {v0, p1, v1}, Lcom/qihoo360/mobilesafe/core/c/c;->a(Ljava/lang/String;Z)V

    .line 956
    new-instance v0, Lcom/qihoo360/mobilesafe/service/KillBean;

    invoke-direct {v0}, Lcom/qihoo360/mobilesafe/service/KillBean;-><init>()V

    .line 957
    iput-object p1, v0, Lcom/qihoo360/mobilesafe/service/KillBean;->packageName:Ljava/lang/String;

    .line 958
    invoke-static {v0}, Lcom/qihoo/security/service/ProcessClearService;->a(Lcom/qihoo360/mobilesafe/service/KillBean;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 971
    :cond_0
    :goto_0
    return-void

    .line 965
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public finish()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1247
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 1248
    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->ai:Z

    if-eqz v1, :cond_0

    .line 1249
    const-class v1, Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1250
    const/high16 v1, 0x14000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1252
    const-string/jumbo v1, "fragment_index"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1254
    const-string/jumbo v1, "jump_result_page"

    iget-boolean v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->ah:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1256
    const-string/jumbo v1, "jump_result_page_param"

    const/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1258
    const-string/jumbo v1, "from_notify"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1259
    const-string/jumbo v1, "reset_main_page"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1260
    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->startActivity(Landroid/content/Intent;)V

    .line 1262
    :cond_0
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->finish()V

    .line 1263
    return-void
.end method

.method protected j()V
    .locals 2

    .prologue
    .line 339
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->j()V

    .line 340
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->o:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c0017

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->b(Ljava/lang/String;)V

    .line 341
    return-void
.end method

.method protected n()V
    .locals 2

    .prologue
    .line 975
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->s()V

    .line 976
    const/16 v0, 0x2c34

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/qihoo/security/support/b;->b(II)V

    .line 978
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->n()V

    .line 979
    return-void
.end method

.method public o()V
    .locals 6

    .prologue
    .line 318
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->r()I

    move-result v0

    .line 319
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->c()J

    move-result-wide v2

    .line 320
    iget-wide v4, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->O:J

    int-to-long v0, v0

    add-long/2addr v0, v4

    const-wide/16 v4, 0x64

    mul-long/2addr v0, v4

    div-long/2addr v0, v2

    long-to-int v0, v0

    .line 321
    invoke-static {v0}, Lcom/qihoo/security/booster/a;->a(I)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v0

    .line 329
    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->ad:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 330
    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v0

    .line 331
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v1, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Landroid/graphics/drawable/Drawable;)V

    .line 332
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v1, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->b(Landroid/graphics/drawable/Drawable;)V

    .line 333
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->J:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 334
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->K:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-static {v1, v0}, Lcom/qihoo360/mobilesafe/b/c;->a(Landroid/view/View;I)V

    .line 335
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 810
    invoke-super {p0, p1, p2, p3}, Lcom/qihoo/security/app/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 811
    const/4 v0, -0x1

    if-eq p2, v0, :cond_1

    .line 832
    :cond_0
    :goto_0
    return-void

    .line 814
    :cond_1
    const/16 v0, 0x65

    if-ne p1, v0, :cond_0

    .line 816
    const-string/jumbo v0, "has_changed"

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 821
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    if-eqz v0, :cond_0

    .line 823
    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->V:Z

    .line 825
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/core/c/c;->b(Z)V

    .line 826
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->W:Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 827
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    const/4 v4, 0x0

    .line 432
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 523
    :cond_0
    :goto_0
    return-void

    .line 435
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->getGroupCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 436
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->C:Landroid/widget/ExpandableListView;

    invoke-virtual {v0, v4}, Landroid/widget/ExpandableListView;->isGroupExpanded(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 437
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->C:Landroid/widget/ExpandableListView;

    invoke-virtual {v0, v4}, Landroid/widget/ExpandableListView;->collapseGroup(I)Z

    .line 438
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->C:Landroid/widget/ExpandableListView;

    invoke-virtual {v0, v4}, Landroid/widget/ExpandableListView;->setSelection(I)V

    .line 440
    :cond_1
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 441
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->g()Ljava/util/List;

    move-result-object v0

    .line 442
    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 443
    :cond_2
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c0020

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    goto :goto_0

    .line 447
    :cond_3
    iput-boolean v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->Z:Z

    .line 449
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    if-eqz v1, :cond_4

    .line 450
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-virtual {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->e()Z

    move-result v1

    .line 452
    if-eqz v1, :cond_6

    .line 453
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->X:Z

    .line 454
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->h()Ljava/util/List;

    move-result-object v0

    .line 456
    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    .line 460
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    invoke-interface {v1, v0}, Lcom/qihoo360/mobilesafe/core/c/c;->b(Ljava/util/List;)V

    .line 462
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/qihoo/security/service/ProcessClearService;->a(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 507
    :cond_4
    :goto_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-gt v0, v1, :cond_7

    .line 510
    invoke-direct {p0, v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->c(Z)V

    .line 516
    :goto_2
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->S:I

    invoke-direct {p0, v4, v4, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(ZII)V

    goto :goto_0

    .line 475
    :cond_5
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/core/c/c;->e()V

    .line 476
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/qihoo/security/service/ProcessClearService;->a(Ljava/util/List;)V

    goto :goto_1

    .line 499
    :catch_0
    move-exception v0

    goto :goto_1

    .line 489
    :cond_6
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    invoke-interface {v1, v0}, Lcom/qihoo360/mobilesafe/core/c/c;->a(Ljava/util/List;)V

    .line 491
    invoke-static {v0}, Lcom/qihoo/security/service/ProcessClearService;->b(Ljava/util/List;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 512
    :cond_7
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->C:Landroid/widget/ExpandableListView;

    invoke-virtual {v0, v3}, Landroid/widget/ExpandableListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 513
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->y:Landroid/os/Handler;

    const/4 v1, 0x2

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_2

    .line 432
    :pswitch_data_0
    .packed-switch 0x7f0b00f6
        :pswitch_0
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 163
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->c(Landroid/content/Intent;)V

    .line 164
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 165
    const v0, 0x7f030085

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->setContentView(I)V

    .line 166
    iput-boolean v5, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->Z:Z

    .line 167
    iput-object p0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->A:Landroid/content/Context;

    .line 168
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->A:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->B:Landroid/content/pm/PackageManager;

    .line 170
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->p()V

    .line 171
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->q()V

    .line 173
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->A:Landroid/content/Context;

    const-class v1, Lcom/qihoo/security/service/SecurityService;

    sget-object v2, Lcom/qihoo/security/env/a;->f:Ljava/lang/String;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->aj:Landroid/content/ServiceConnection;

    const/4 v4, 0x1

    invoke-static {v0, v1, v2, v3, v4}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;Landroid/content/ServiceConnection;I)V

    .line 176
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->o()V

    .line 179
    invoke-static {}, Lcom/qihoo/security/ui/result/f;->a()Lcom/qihoo/security/ui/result/f;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/qihoo/security/ui/result/f;->a(I)V

    .line 181
    return-void
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    .line 528
    packed-switch p1, :pswitch_data_0

    .line 667
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    :goto_0
    return-object v0

    .line 530
    :pswitch_0
    new-instance v1, Lcom/qihoo/security/dialog/b;

    invoke-direct {v1, p0}, Lcom/qihoo/security/dialog/b;-><init>(Landroid/content/Context;)V

    .line 531
    const v0, 0x7f0c00c1

    invoke-virtual {v1, v0}, Lcom/qihoo/security/dialog/b;->setDialogTitle(I)V

    .line 532
    invoke-virtual {v1}, Lcom/qihoo/security/dialog/b;->c()V

    .line 533
    const v0, 0x7f0c00bc

    invoke-virtual {v1, v0}, Lcom/qihoo/security/dialog/b;->setTitle(I)V

    .line 534
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->A:Landroid/content/Context;

    const v2, 0x7f03009b

    const/4 v3, 0x0

    invoke-static {v0, v2, v3}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 536
    const v0, 0x7f0b0208

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->aa:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 537
    const v0, 0x7f0b0209

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->ab:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 538
    const v0, 0x7f0b020a

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->ac:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 540
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->ac:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/text/TextPaint;->setFlags(I)V

    .line 541
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->ac:Lcom/qihoo/security/locale/widget/LocaleTextView;

    new-instance v3, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$3;

    invoke-direct {v3, p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$3;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)V

    invoke-virtual {v0, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 584
    invoke-virtual {v1, v2}, Lcom/qihoo/security/dialog/b;->a(Landroid/view/View;)Landroid/view/View;

    .line 585
    invoke-virtual {v1, v4}, Lcom/qihoo/security/dialog/b;->setCancelable(Z)V

    .line 587
    new-array v0, v5, [I

    fill-array-data v0, :array_0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/dialog/b;->setButtonText([I)V

    .line 588
    new-array v0, v5, [Landroid/view/View$OnClickListener;

    const/4 v2, 0x0

    new-instance v3, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$4;

    invoke-direct {v3, p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$4;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)V

    aput-object v3, v0, v2

    new-instance v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$5;

    invoke-direct {v2, p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$5;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)V

    aput-object v2, v0, v4

    invoke-virtual {v1, v0}, Lcom/qihoo/security/dialog/b;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    move-object v0, v1

    .line 663
    goto :goto_0

    .line 528
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch

    .line 587
    :array_0
    .array-data 4
        0x7f0c0157
        0x7f0c014f
    .end array-data
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .prologue
    .line 345
    new-instance v0, Lcom/qihoo/security/locale/widget/a;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->A:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/locale/widget/a;-><init>(Landroid/content/Context;)V

    .line 347
    const v1, 0x7f100003

    invoke-virtual {v0, v1, p1}, Lcom/qihoo/security/locale/widget/a;->inflate(ILandroid/view/Menu;)V

    .line 348
    const v0, 0x7f0b0255

    const v1, 0x7f020066

    invoke-virtual {p0, p1, v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Landroid/view/Menu;II)V

    .line 350
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method protected onDestroy()V
    .locals 3

    .prologue
    .line 405
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onDestroy()V

    .line 409
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->z:Ljava/lang/String;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->A:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->aj:Landroid/content/ServiceConnection;

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/b/s;->a(Ljava/lang/String;Landroid/content/Context;Landroid/content/ServiceConnection;)V

    .line 410
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->y:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 412
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    if-eqz v0, :cond_0

    .line 414
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->ak:Lcom/qihoo360/mobilesafe/core/c/b;

    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/core/c/c;->b(Lcom/qihoo360/mobilesafe/core/c/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 424
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->Q:Lcom/qihoo360/mobilesafe/b/g;

    if-eqz v0, :cond_1

    .line 425
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->Q:Lcom/qihoo360/mobilesafe/b/g;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/b/g;->a()V

    .line 428
    :cond_1
    return-void

    .line 415
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 800
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 801
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->s()V

    .line 802
    const/16 v0, 0x2c34

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/support/b;->b(II)V

    .line 805
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/app/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 187
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 188
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->c(Landroid/content/Intent;)V

    .line 189
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    .prologue
    .line 355
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 366
    :goto_0
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0

    .line 357
    :pswitch_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->A:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 359
    const-string/jumbo v1, "white_list_type"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 361
    const/16 v1, 0x65

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    .line 355
    :pswitch_data_0
    .packed-switch 0x7f0b0255
        :pswitch_0
    .end packed-switch
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 384
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onPause()V

    .line 385
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    if-eqz v0, :cond_0

    .line 387
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/core/c/c;->d()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 393
    :cond_0
    :goto_0
    return-void

    .line 388
    :catch_0
    move-exception v0

    .line 389
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    goto :goto_0
.end method

.method protected onPrepareDialog(ILandroid/app/Dialog;)V
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/4 v6, 0x1

    .line 672
    if-ne p1, v6, :cond_0

    .line 673
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    if-eqz v0, :cond_0

    .line 674
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    iget v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->N:I

    iget v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->M:I

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b(II)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    move-result-object v1

    .line 676
    if-eqz v1, :cond_0

    move-object v0, p2

    .line 677
    check-cast v0, Lcom/qihoo/security/dialog/b;

    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->b:Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/dialog/b;->setDialogTitle(Ljava/lang/CharSequence;)V

    .line 679
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->aa:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->o:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c00bd

    new-array v4, v6, [Ljava/lang/Object;

    iget-object v5, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->a:Ljava/lang/String;

    aput-object v5, v4, v8

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 682
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->ab:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->o:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c00c0

    new-array v4, v6, [Ljava/lang/Object;

    iget v1, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    int-to-long v6, v1

    invoke-virtual {p0, v6, v7}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(J)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v8

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 692
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/app/BaseActivity;->onPrepareDialog(ILandroid/app/Dialog;)V

    .line 693
    return-void
.end method

.method protected onResume()V
    .locals 0

    .prologue
    .line 379
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onResume()V

    .line 380
    return-void
.end method

.method protected onStart()V
    .locals 0

    .prologue
    .line 371
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onStart()V

    .line 375
    return-void
.end method

.method public onStop()V
    .locals 0

    .prologue
    .line 397
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onStop()V

    .line 401
    return-void
.end method
