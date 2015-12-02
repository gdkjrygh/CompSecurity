.class public Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$a;,
        Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;,
        Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;
    }
.end annotation


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field private A:Landroid/content/Context;

.field private B:Landroid/content/pm/PackageManager;

.field private C:Landroid/widget/ExpandableListView;

.field private D:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

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

.field private ag:I

.field private ah:Landroid/content/IntentFilter;

.field private ai:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$a;

.field private aj:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;"
        }
    .end annotation
.end field

.field private ak:Z

.field private final al:Landroid/content/ServiceConnection;

.field private final am:Lcom/qihoo360/mobilesafe/core/c/b;

.field private final an:I

.field private final ao:I

.field y:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 95
    const-class v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->z:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 93
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    .line 99
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->A:Landroid/content/Context;

    .line 118
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    .line 119
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->Q:Lcom/qihoo360/mobilesafe/b/g;

    .line 129
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->T:Ljava/util/HashMap;

    .line 131
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->U:Ljava/util/HashSet;

    .line 158
    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ai:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$a;

    .line 161
    iput-boolean v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ak:Z

    .line 759
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;-><init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->al:Landroid/content/ServiceConnection;

    .line 821
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7;-><init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->am:Lcom/qihoo360/mobilesafe/core/c/b;

    .line 899
    iput v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->an:I

    .line 901
    const/4 v0, 0x2

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ao:I

    .line 902
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$8;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$8;-><init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->y:Landroid/os/Handler;

    .line 2076
    return-void
.end method

.method private a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I
    .locals 2

    .prologue
    .line 283
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-ne p1, v0, :cond_0

    .line 284
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080058

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 288
    :goto_0
    return v0

    .line 285
    :cond_0
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->NEED_OPTIMIZE:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-ne p1, v0, :cond_1

    .line 286
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080057

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    goto :goto_0

    .line 288
    :cond_1
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080056

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;I)I
    .locals 0

    .prologue
    .line 93
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->N:I

    return p1
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;J)J
    .locals 1

    .prologue
    .line 93
    iput-wide p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->O:J

    return-wide p1
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;Landroid/view/View;)Landroid/view/View;
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->L:Landroid/view/View;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;Lcom/qihoo360/mobilesafe/core/c/c;)Lcom/qihoo360/mobilesafe/core/c/c;
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    return-object p1
.end method

.method private a(Lcom/qihoo360/mobilesafe/service/ProcessInfo;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 1145
    const-string/jumbo v0, ""

    .line 1147
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->B:Landroid/content/pm/PackageManager;

    iget-object v2, p1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    const/16 v3, 0x80

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    .line 1149
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->B:Landroid/content/pm/PackageManager;

    invoke-virtual {v1, v2}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v1

    .line 1150
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1151
    iget-object v0, p1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    .line 1160
    :cond_0
    :goto_0
    return-object v0

    .line 1153
    :cond_1
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 1155
    :catch_0
    move-exception v1

    .line 1156
    iget-object v1, p1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1157
    iget-object v0, p1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    goto :goto_0
.end method

.method private a(II)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1213
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->y:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 1214
    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 1215
    iput p2, v0, Landroid/os/Message;->arg2:I

    .line 1216
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1217
    iput v2, v0, Landroid/os/Message;->what:I

    .line 1218
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->y:Landroid/os/Handler;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 1219
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->y:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1220
    return-void
.end method

.method private a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo/security/opti/a/a$a;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1073
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1075
    :try_start_0
    iget-object v0, p1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->a:Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/a/a$a;

    .line 1076
    if-eqz v0, :cond_0

    .line 1077
    invoke-virtual {v0}, Lcom/qihoo/security/opti/a/a$a;->a()I

    move-result v0

    iput v0, p1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->j:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1085
    :cond_0
    :goto_0
    return-void

    .line 1079
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;II)V
    .locals 0

    .prologue
    .line 93
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(II)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;ZII)V
    .locals 0

    .prologue
    .line 93
    invoke-direct {p0, p1, p2, p3}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(ZII)V

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

    .line 1050
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->I:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1051
    iget-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->V:Z

    if-nez v0, :cond_0

    .line 1052
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->V:Z

    .line 1053
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1054
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->H:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1055
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->C:Landroid/widget/ExpandableListView;

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setVisibility(I)V

    .line 1056
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->b(Ljava/util/List;Ljava/util/Map;)V

    .line 1057
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->C:Landroid/widget/ExpandableListView;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setAdapter(Landroid/widget/ExpandableListAdapter;)V

    .line 1058
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    if-eqz v0, :cond_0

    .line 1059
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->b()V

    .line 1070
    :cond_0
    :goto_0
    return-void

    .line 1062
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    if-eqz v0, :cond_2

    .line 1063
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a()V

    .line 1065
    :cond_2
    invoke-direct {p0, v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->d(I)V

    .line 1066
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->C:Landroid/widget/ExpandableListView;

    invoke-virtual {v0, v2}, Landroid/widget/ExpandableListView;->setVisibility(I)V

    .line 1067
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->H:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method private a(ZII)V
    .locals 0

    .prologue
    .line 1171
    invoke-direct {p0, p3, p2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(II)V

    .line 1174
    if-eqz p1, :cond_0

    .line 1175
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->o()V

    .line 1177
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;Z)Z
    .locals 0

    .prologue
    .line 93
    iput-boolean p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->Z:Z

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;I)I
    .locals 0

    .prologue
    .line 93
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->M:I

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
    .line 1088
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput v2, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->S:I

    .line 1090
    if-eqz p1, :cond_5

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    .line 1091
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 1092
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 1093
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 1095
    const/4 v3, 0x0

    .line 1096
    const/4 v2, 0x0

    .line 1097
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

    .line 1098
    move-object/from16 v0, p0

    invoke-direct {v0, v9}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo360/mobilesafe/service/ProcessInfo;)Ljava/lang/String;

    move-result-object v4

    .line 1099
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->T:Ljava/util/HashMap;

    invoke-virtual {v2, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1103
    new-instance v2, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

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

    invoke-direct/range {v2 .. v10}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;-><init>(Ljava/lang/String;Ljava/lang/String;IZZZ[II)V

    .line 1105
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v2, v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;Ljava/util/Map;)V

    .line 1106
    iget-boolean v3, v2, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->h:Z

    if-nez v3, :cond_3

    .line 1107
    iget v4, v2, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->d:I

    .line 1108
    add-int v3, v12, v4

    .line 1110
    iget-boolean v5, v2, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->e:Z

    if-eqz v5, :cond_2

    .line 1111
    add-int/2addr v11, v4

    .line 1112
    invoke-interface {v13, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2
    move v2, v11

    :goto_3
    move v11, v2

    move v12, v3

    .line 1119
    goto :goto_0

    .line 1103
    :cond_1
    const/4 v8, 0x0

    goto :goto_1

    .line 1114
    :cond_2
    invoke-interface {v14, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 1117
    :cond_3
    invoke-interface {v15, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v2, v11

    move v3, v12

    goto :goto_3

    .line 1132
    :cond_4
    move-object/from16 v0, p0

    iput v12, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->S:I

    .line 1134
    new-instance v2, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    move-object/from16 v0, p0

    invoke-direct {v2, v0, v13, v14, v15}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;-><init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    .line 1136
    :cond_5
    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Z
    .locals 1

    .prologue
    .line 93
    iget-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->Z:Z

    return v0
.end method

.method static synthetic b(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;Z)Z
    .locals 0

    .prologue
    .line 93
    iput-boolean p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->X:Z

    return p1
.end method

.method private b(J)[Ljava/lang/String;
    .locals 5

    .prologue
    .line 2091
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->r()I

    move-result v0

    .line 2092
    iget-wide v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->O:J

    int-to-long v0, v0

    add-long/2addr v0, v2

    .line 2093
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->c()J

    move-result-wide v2

    sub-long v0, v2, v0

    .line 2098
    iget v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ag:I

    invoke-static {v2, v0, v1, p1, p2}, Lcom/qihoo360/mobilesafe/b/s;->a(IJJ)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I
    .locals 1

    .prologue
    .line 93
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->N:I

    return v0
.end method

.method static synthetic c(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;I)I
    .locals 0

    .prologue
    .line 93
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->S:I

    return p1
.end method

.method private c(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 188
    if-eqz p1, :cond_0

    .line 189
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->A:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 192
    :cond_0
    invoke-static {}, Lcom/qihoo/security/ui/result/f;->a()Lcom/qihoo/security/ui/result/f;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/result/f;->a(I)V

    .line 193
    return-void
.end method

.method private c(Z)V
    .locals 12

    .prologue
    const/4 v1, 0x1

    const/4 v3, -0x1

    const/4 v0, 0x0

    .line 633
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->r()I

    move-result v6

    .line 635
    if-nez p1, :cond_2

    if-gtz v6, :cond_2

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->U:Ljava/util/HashSet;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->U:Ljava/util/HashSet;

    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_0
    iget-boolean v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->W:Z

    if-nez v2, :cond_2

    .line 639
    iput-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ak:Z

    .line 640
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->finish()V

    .line 701
    :cond_1
    :goto_0
    return-void

    .line 642
    :cond_2
    iput-boolean v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ak:Z

    .line 643
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 644
    if-eqz v7, :cond_1

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    if-eqz v2, :cond_1

    .line 649
    if-eqz p1, :cond_6

    .line 650
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    invoke-virtual {v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->d()Z

    move-result v5

    .line 651
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    invoke-virtual {v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->k()[I

    move-result-object v4

    .line 653
    aget v2, v4, v0

    .line 655
    aget v4, v4, v1

    .line 656
    iget v8, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->S:I

    add-int/2addr v6, v8

    .line 658
    iput-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->W:Z

    .line 668
    :goto_1
    if-nez v5, :cond_3

    if-eqz p1, :cond_4

    :cond_3
    move v0, v1

    .line 671
    :cond_4
    iget-wide v8, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->O:J

    int-to-long v10, v6

    add-long/2addr v8, v10

    .line 672
    if-eqz v5, :cond_5

    .line 673
    sget-object v1, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ad:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 686
    :cond_5
    const-string/jumbo v1, "is_need_read"

    iget-boolean v10, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->W:Z

    invoke-virtual {v7, v1, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 687
    const-string/jumbo v1, "is_best_fade"

    invoke-virtual {v7, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 688
    const-string/jumbo v0, "is_best"

    invoke-virtual {v7, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 689
    const-string/jumbo v0, "extra_killed_memory"

    invoke-virtual {v7, v0, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 690
    const-string/jumbo v0, "free_memory_kb"

    invoke-virtual {v7, v0, v8, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 691
    const-string/jumbo v0, "exam_status"

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ad:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 692
    const-string/jumbo v0, "kill_prower_count"

    invoke-virtual {v7, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 693
    const-string/jumbo v0, "kill_process_count"

    invoke-virtual {v7, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 694
    invoke-virtual {p0, v3, v7}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->setResult(ILandroid/content/Intent;)V

    .line 697
    const/16 v0, 0x2c2a

    div-int/lit16 v1, v6, 0x400

    invoke-static {v0, v1}, Lcom/qihoo/security/support/b;->b(II)V

    .line 698
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->finish()V

    goto :goto_0

    .line 659
    :cond_6
    if-lez v6, :cond_7

    .line 660
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    invoke-virtual {v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->e()Z

    move-result v5

    .line 661
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    invoke-virtual {v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->j()I

    move-result v4

    .line 662
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    invoke-virtual {v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->i()I

    move-result v2

    goto :goto_1

    :cond_7
    move v2, v3

    move v4, v3

    move v5, v0

    goto :goto_1
.end method

.method static synthetic c(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;Z)Z
    .locals 0

    .prologue
    .line 93
    iput-boolean p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->W:Z

    return p1
.end method

.method static synthetic d(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I
    .locals 1

    .prologue
    .line 93
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->M:I

    return v0
.end method

.method private d(I)V
    .locals 8

    .prologue
    const/4 v6, 0x1

    const/4 v2, 0x0

    .line 1180
    const-string/jumbo v0, ""

    .line 1181
    const-string/jumbo v1, ""

    .line 1182
    int-to-long v4, p1

    .line 1183
    invoke-direct {p0, v4, v5}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->b(J)[Ljava/lang/String;

    move-result-object v3

    .line 1184
    if-eqz v3, :cond_2

    .line 1185
    aget-object v4, v3, v2

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 1186
    aget-object v0, v3, v2

    .line 1188
    :cond_0
    aget-object v4, v3, v6

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 1189
    aget-object v1, v3, v6

    move-object v7, v1

    move-object v1, v0

    move-object v0, v7

    .line 1193
    :goto_0
    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->E:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v3, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 1194
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->F:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 1196
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    if-eqz v0, :cond_1

    .line 1197
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->g()I

    move-result v0

    .line 1199
    :goto_1
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->K:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->o:Lcom/qihoo/security/locale/d;

    const v4, 0x7f0c002c

    new-array v5, v6, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v5, v2

    invoke-virtual {v3, v4, v5}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 1200
    return-void

    :cond_1
    move v0, v2

    goto :goto_1

    :cond_2
    move-object v7, v1

    move-object v1, v0

    move-object v0, v7

    goto :goto_0
.end method

.method static synthetic d(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;I)V
    .locals 0

    .prologue
    .line 93
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->d(I)V

    return-void
.end method

.method static synthetic d(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;Z)V
    .locals 0

    .prologue
    .line 93
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->c(Z)V

    return-void
.end method

.method static synthetic e(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;I)I
    .locals 1

    .prologue
    .line 93
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->S:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->S:I

    return v0
.end method

.method static synthetic e(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Landroid/view/View;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->L:Landroid/view/View;

    return-object v0
.end method

.method static synthetic f(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I
    .locals 1

    .prologue
    .line 93
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->S:I

    return v0
.end method

.method static synthetic f(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;I)I
    .locals 1

    .prologue
    .line 93
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->S:I

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->S:I

    return v0
.end method

.method static synthetic g(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;I)I
    .locals 0

    .prologue
    .line 93
    iput p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ag:I

    return p1
.end method

.method static synthetic g(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->T:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic h(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo360/mobilesafe/core/c/c;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    return-object v0
.end method

.method static synthetic i(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo360/mobilesafe/core/c/b;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->am:Lcom/qihoo360/mobilesafe/core/c/b;

    return-object v0
.end method

.method static synthetic j(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Landroid/view/View;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->H:Landroid/view/View;

    return-object v0
.end method

.method static synthetic k(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Landroid/view/View;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->I:Landroid/view/View;

    return-object v0
.end method

.method static synthetic l(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Z
    .locals 1

    .prologue
    .line 93
    iget-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->X:Z

    return v0
.end method

.method static synthetic m(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Landroid/widget/ExpandableListView;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->C:Landroid/widget/ExpandableListView;

    return-object v0
.end method

.method static synthetic n(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo/security/a/a/a;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->R:Lcom/qihoo/security/a/a/a;

    return-object v0
.end method

.method static synthetic o(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Landroid/view/LayoutInflater;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->Y:Landroid/view/LayoutInflater;

    return-object v0
.end method

.method static synthetic p(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo360/mobilesafe/b/g;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->Q:Lcom/qihoo360/mobilesafe/b/g;

    return-object v0
.end method

.method private p()V
    .locals 8

    .prologue
    const-wide/16 v6, -0x1

    .line 196
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 197
    const-string/jumbo v1, "free_memory_kb"

    invoke-virtual {v0, v1, v6, v7}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v2

    .line 198
    const-string/jumbo v1, "battery_power"

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ag:I

    .line 199
    cmp-long v0, v2, v6

    if-nez v0, :cond_0

    .line 200
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->d()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->O:J

    .line 210
    :goto_0
    return-void

    .line 205
    :cond_0
    iput-wide v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->O:J

    goto :goto_0
.end method

.method static synthetic q(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->A:Landroid/content/Context;

    return-object v0
.end method

.method private q()V
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/16 v3, 0x30

    const/4 v2, 0x3

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 213
    const-string/jumbo v0, "layout_inflater"

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->Y:Landroid/view/LayoutInflater;

    .line 214
    new-instance v0, Lcom/qihoo360/mobilesafe/b/g;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->A:Landroid/content/Context;

    invoke-direct {v0, v1, v3, v3}, Lcom/qihoo360/mobilesafe/b/g;-><init>(Landroid/content/Context;II)V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->Q:Lcom/qihoo360/mobilesafe/b/g;

    .line 215
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->A:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->Y:Landroid/view/LayoutInflater;

    .line 217
    const v0, 0x7f0b009b

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->I:Landroid/view/View;

    .line 218
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->I:Landroid/view/View;

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 220
    const v0, 0x7f0b01ac

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->H:Landroid/view/View;

    .line 221
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->H:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 223
    const v0, 0x7f0b00eb

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->J:Landroid/view/View;

    .line 224
    const v0, 0x7f0b0146

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ExpandableListView;

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->C:Landroid/widget/ExpandableListView;

    .line 225
    const v0, 0x7f0b01a9

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->E:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 227
    const v0, 0x7f0b01aa

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->F:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 228
    const v0, 0x7f0b01a8

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->G:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 229
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->G:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->o:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c0037

    new-array v4, v7, [Ljava/lang/Object;

    iget v5, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ag:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-virtual {v1, v3, v4}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 230
    const v0, 0x7f0b00f6

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->K:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 231
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->K:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->o:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c002c

    new-array v4, v7, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-virtual {v1, v3, v4}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 232
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->K:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 233
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->C:Landroid/widget/ExpandableListView;

    invoke-virtual {v0, v8}, Landroid/widget/ExpandableListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 234
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->C:Landroid/widget/ExpandableListView;

    invoke-virtual {v0, v8}, Landroid/widget/ExpandableListView;->setGroupIndicator(Landroid/graphics/drawable/Drawable;)V

    .line 235
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->C:Landroid/widget/ExpandableListView;

    new-instance v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$1;-><init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setOnGroupClickListener(Landroid/widget/ExpandableListView$OnGroupClickListener;)V

    .line 254
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->C:Landroid/widget/ExpandableListView;

    new-instance v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$2;-><init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setOnChildClickListener(Landroid/widget/ExpandableListView$OnChildClickListener;)V

    .line 272
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 273
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 274
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ae:I

    .line 275
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->af:I

    .line 278
    new-instance v1, Lcom/qihoo/security/a/a/a;

    const-wide/16 v4, 0x78

    iget v6, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ae:I

    iget v7, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->af:I

    move v3, v2

    invoke-direct/range {v1 .. v7}, Lcom/qihoo/security/a/a/a;-><init>(IIJII)V

    iput-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->R:Lcom/qihoo/security/a/a/a;

    .line 280
    return-void
.end method

.method private r()I
    .locals 3

    .prologue
    .line 704
    const/4 v0, 0x0

    .line 705
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->T:Ljava/util/HashMap;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->T:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 706
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->T:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    .line 707
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 708
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 709
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 710
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/2addr v0, v1

    move v1, v0

    .line 711
    goto :goto_0

    :cond_0
    move v0, v1

    .line 713
    :cond_1
    return v0
.end method

.method static synthetic r(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I
    .locals 1

    .prologue
    .line 93
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ae:I

    return v0
.end method

.method static synthetic s(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I
    .locals 1

    .prologue
    .line 93
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->af:I

    return v0
.end method

.method private s()V
    .locals 1

    .prologue
    .line 720
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 721
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->c(Z)V

    .line 723
    :cond_0
    return-void
.end method

.method static synthetic t(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Ljava/util/List;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->aj:Ljava/util/List;

    return-object v0
.end method

.method static synthetic u(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I
    .locals 1

    .prologue
    .line 93
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ag:I

    return v0
.end method

.method static synthetic v(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->G:Lcom/qihoo/security/locale/widget/LocaleTextView;

    return-object v0
.end method


# virtual methods
.method public a(J)Ljava/lang/String;
    .locals 3

    .prologue
    .line 1203
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
    .line 1031
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->aj:Ljava/util/List;

    .line 1032
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1033
    invoke-static {p1}, Lcom/qihoo/security/opti/a/a;->a(Ljava/util/List;)Ljava/util/Map;

    move-result-object v0

    .line 1034
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1035
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->aj:Ljava/util/List;

    invoke-direct {p0, v1, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Ljava/util/List;Ljava/util/Map;)V

    .line 1040
    :cond_0
    :goto_0
    return-void

    .line 1038
    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Ljava/util/List;Ljava/util/Map;)V

    goto :goto_0
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 873
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    if-eqz v0, :cond_0

    .line 875
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->U:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 876
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    const/4 v1, 0x1

    invoke-interface {v0, p1, v1}, Lcom/qihoo360/mobilesafe/core/c/c;->a(Ljava/lang/String;Z)V

    .line 877
    new-instance v0, Lcom/qihoo360/mobilesafe/service/KillBean;

    invoke-direct {v0}, Lcom/qihoo360/mobilesafe/service/KillBean;-><init>()V

    .line 878
    iput-object p1, v0, Lcom/qihoo360/mobilesafe/service/KillBean;->packageName:Ljava/lang/String;

    .line 879
    invoke-static {v0}, Lcom/qihoo/security/service/ProcessClearService;->a(Lcom/qihoo360/mobilesafe/service/KillBean;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 890
    :cond_0
    :goto_0
    return-void

    .line 884
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public finish()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 2103
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 2104
    if-eqz v0, :cond_0

    const-string/jumbo v1, "from_notify"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2105
    const-class v1, Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 2106
    const/high16 v1, 0x14000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 2107
    const-string/jumbo v1, "fragment_index"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 2108
    const-string/jumbo v1, "jump_result_page"

    iget-boolean v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ak:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 2109
    const-string/jumbo v1, "jump_result_page_param"

    const/16 v2, 0x3e9

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 2110
    const-string/jumbo v1, "from_notify"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 2111
    const-string/jumbo v1, "reset_main_page"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 2112
    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->startActivity(Landroid/content/Intent;)V

    .line 2114
    :cond_0
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->finish()V

    .line 2115
    return-void
.end method

.method protected j()V
    .locals 2

    .prologue
    .line 317
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->j()V

    .line 318
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->o:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c002b

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->b(Ljava/lang/String;)V

    .line 319
    return-void
.end method

.method protected n()V
    .locals 2

    .prologue
    .line 894
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->s()V

    .line 895
    const/16 v0, 0x2c35

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/qihoo/security/support/b;->b(II)V

    .line 896
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->n()V

    .line 897
    return-void
.end method

.method public o()V
    .locals 6

    .prologue
    .line 297
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->r()I

    move-result v0

    .line 298
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->c()J

    move-result-wide v2

    .line 299
    iget-wide v4, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->O:J

    int-to-long v0, v0

    add-long/2addr v0, v4

    const-wide/16 v4, 0x64

    mul-long/2addr v0, v4

    div-long/2addr v0, v2

    long-to-int v0, v0

    .line 300
    invoke-static {v0}, Lcom/qihoo/security/booster/a;->a(I)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v0

    .line 307
    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ad:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 308
    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v0

    .line 309
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v1, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Landroid/graphics/drawable/Drawable;)V

    .line 310
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v1, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->b(Landroid/graphics/drawable/Drawable;)V

    .line 311
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->J:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 312
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->K:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-static {v1, v0}, Lcom/qihoo360/mobilesafe/b/c;->a(Landroid/view/View;I)V

    .line 313
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 736
    invoke-super {p0, p1, p2, p3}, Lcom/qihoo/security/app/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 737
    const/4 v0, -0x1

    if-eq p2, v0, :cond_1

    .line 757
    :cond_0
    :goto_0
    return-void

    .line 740
    :cond_1
    const/16 v0, 0x65

    if-ne p1, v0, :cond_0

    .line 742
    const-string/jumbo v0, "has_changed"

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 746
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    if-eqz v0, :cond_0

    .line 748
    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->V:Z

    .line 750
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/core/c/c;->b(Z)V

    .line 751
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->W:Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 752
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

    .line 407
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 484
    :cond_0
    :goto_0
    return-void

    .line 409
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->getGroupCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 410
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->C:Landroid/widget/ExpandableListView;

    invoke-virtual {v0, v4}, Landroid/widget/ExpandableListView;->isGroupExpanded(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 411
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->C:Landroid/widget/ExpandableListView;

    invoke-virtual {v0, v4}, Landroid/widget/ExpandableListView;->collapseGroup(I)Z

    .line 412
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->C:Landroid/widget/ExpandableListView;

    invoke-virtual {v0, v4}, Landroid/widget/ExpandableListView;->setSelection(I)V

    .line 414
    :cond_1
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 415
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->f()Ljava/util/List;

    move-result-object v0

    .line 416
    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 417
    :cond_2
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c0020

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    goto :goto_0

    .line 420
    :cond_3
    iput-boolean v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->Z:Z

    .line 422
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    if-eqz v1, :cond_4

    .line 423
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    invoke-virtual {v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->d()Z

    move-result v1

    .line 425
    if-eqz v1, :cond_6

    .line 426
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->X:Z

    .line 427
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->h()Ljava/util/List;

    move-result-object v0

    .line 428
    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    .line 430
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    invoke-interface {v1, v0}, Lcom/qihoo360/mobilesafe/core/c/c;->b(Ljava/util/List;)V

    .line 431
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/qihoo/security/service/ProcessClearService;->a(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 468
    :cond_4
    :goto_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-gt v0, v1, :cond_7

    .line 471
    invoke-direct {p0, v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->c(Z)V

    .line 477
    :goto_2
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->S:I

    invoke-direct {p0, v4, v4, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(ZII)V

    goto :goto_0

    .line 441
    :cond_5
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/core/c/c;->e()V

    .line 442
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/qihoo/security/service/ProcessClearService;->a(Ljava/util/List;)V

    goto :goto_1

    .line 461
    :catch_0
    move-exception v0

    goto :goto_1

    .line 453
    :cond_6
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    invoke-interface {v1, v0}, Lcom/qihoo360/mobilesafe/core/c/c;->a(Ljava/util/List;)V

    .line 455
    invoke-static {v0}, Lcom/qihoo/security/service/ProcessClearService;->b(Ljava/util/List;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 473
    :cond_7
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->C:Landroid/widget/ExpandableListView;

    invoke-virtual {v0, v3}, Landroid/widget/ExpandableListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 474
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->y:Landroid/os/Handler;

    const/4 v1, 0x2

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_2

    .line 407
    :pswitch_data_0
    .packed-switch 0x7f0b00f6
        :pswitch_0
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    .line 165
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 166
    const v0, 0x7f030081

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->setContentView(I)V

    .line 167
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->Z:Z

    .line 168
    iput-object p0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->A:Landroid/content/Context;

    .line 169
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->A:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->B:Landroid/content/pm/PackageManager;

    .line 170
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->p()V

    .line 171
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->q()V

    .line 172
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$a;-><init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$1;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ai:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$a;

    .line 173
    new-instance v0, Landroid/content/IntentFilter;

    const-string/jumbo v1, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ah:Landroid/content/IntentFilter;

    .line 175
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->A:Landroid/content/Context;

    const-class v1, Lcom/qihoo/security/service/SecurityService;

    sget-object v2, Lcom/qihoo/security/env/a;->f:Ljava/lang/String;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->al:Landroid/content/ServiceConnection;

    const/4 v4, 0x1

    invoke-static {v0, v1, v2, v3, v4}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;Landroid/content/ServiceConnection;I)V

    .line 177
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->o()V

    .line 178
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->c(Landroid/content/Intent;)V

    .line 179
    return-void
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    .line 488
    packed-switch p1, :pswitch_data_0

    .line 605
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    :goto_0
    return-object v0

    .line 490
    :pswitch_0
    new-instance v1, Lcom/qihoo/security/dialog/b;

    invoke-direct {v1, p0}, Lcom/qihoo/security/dialog/b;-><init>(Landroid/content/Context;)V

    .line 491
    const v0, 0x7f0c00c1

    invoke-virtual {v1, v0}, Lcom/qihoo/security/dialog/b;->setDialogTitle(I)V

    .line 492
    invoke-virtual {v1}, Lcom/qihoo/security/dialog/b;->c()V

    .line 493
    const v0, 0x7f0c00bc

    invoke-virtual {v1, v0}, Lcom/qihoo/security/dialog/b;->setTitle(I)V

    .line 494
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->A:Landroid/content/Context;

    const v2, 0x7f03009b

    const/4 v3, 0x0

    invoke-static {v0, v2, v3}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 495
    const v0, 0x7f0b0208

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->aa:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 496
    const v0, 0x7f0b0209

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ab:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 497
    const v0, 0x7f0b020a

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ac:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 498
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ac:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/text/TextPaint;->setFlags(I)V

    .line 499
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ac:Lcom/qihoo/security/locale/widget/LocaleTextView;

    new-instance v3, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$3;

    invoke-direct {v3, p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$3;-><init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)V

    invoke-virtual {v0, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 533
    invoke-virtual {v1, v2}, Lcom/qihoo/security/dialog/b;->a(Landroid/view/View;)Landroid/view/View;

    .line 534
    invoke-virtual {v1, v4}, Lcom/qihoo/security/dialog/b;->setCancelable(Z)V

    .line 536
    new-array v0, v5, [I

    fill-array-data v0, :array_0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/dialog/b;->setButtonText([I)V

    .line 537
    new-array v0, v5, [Landroid/view/View$OnClickListener;

    const/4 v2, 0x0

    new-instance v3, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$4;

    invoke-direct {v3, p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$4;-><init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)V

    aput-object v3, v0, v2

    new-instance v2, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$5;

    invoke-direct {v2, p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$5;-><init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)V

    aput-object v2, v0, v4

    invoke-virtual {v1, v0}, Lcom/qihoo/security/dialog/b;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    move-object v0, v1

    .line 601
    goto :goto_0

    .line 488
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch

    .line 536
    :array_0
    .array-data 4
        0x7f0c0157
        0x7f0c014f
    .end array-data
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .prologue
    .line 323
    new-instance v0, Lcom/qihoo/security/locale/widget/a;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->A:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/locale/widget/a;-><init>(Landroid/content/Context;)V

    .line 324
    const v1, 0x7f100003

    invoke-virtual {v0, v1, p1}, Lcom/qihoo/security/locale/widget/a;->inflate(ILandroid/view/Menu;)V

    .line 325
    const v0, 0x7f0b0255

    const v1, 0x7f020066

    invoke-virtual {p0, p1, v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Landroid/view/Menu;II)V

    .line 326
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method protected onDestroy()V
    .locals 3

    .prologue
    .line 382
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onDestroy()V

    .line 386
    sget-object v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->z:Ljava/lang/String;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->A:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->al:Landroid/content/ServiceConnection;

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/b/s;->a(Ljava/lang/String;Landroid/content/Context;Landroid/content/ServiceConnection;)V

    .line 387
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->y:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 389
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    if-eqz v0, :cond_0

    .line 391
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->am:Lcom/qihoo360/mobilesafe/core/c/b;

    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/core/c/c;->b(Lcom/qihoo360/mobilesafe/core/c/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 399
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->Q:Lcom/qihoo360/mobilesafe/b/g;

    if-eqz v0, :cond_1

    .line 400
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->Q:Lcom/qihoo360/mobilesafe/b/g;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/b/g;->a()V

    .line 403
    :cond_1
    return-void

    .line 392
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 727
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 728
    invoke-direct {p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->s()V

    .line 729
    const/16 v0, 0x2c35

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/support/b;->b(II)V

    .line 731
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/app/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 183
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 184
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->c(Landroid/content/Intent;)V

    .line 185
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    .prologue
    .line 331
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 341
    :goto_0
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0

    .line 333
    :pswitch_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->A:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 334
    const-string/jumbo v1, "white_list_type"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 336
    const/16 v1, 0x65

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    .line 331
    :pswitch_data_0
    .packed-switch 0x7f0b0255
        :pswitch_0
    .end packed-switch
.end method

.method protected onPause()V
    .locals 2

    .prologue
    .line 360
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onPause()V

    .line 361
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->A:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ai:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$a;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 362
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    if-eqz v0, :cond_0

    .line 364
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->P:Lcom/qihoo360/mobilesafe/core/c/c;

    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/core/c/c;->d()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 370
    :cond_0
    :goto_0
    return-void

    .line 365
    :catch_0
    move-exception v0

    .line 366
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    goto :goto_0
.end method

.method protected onPrepareDialog(ILandroid/app/Dialog;)V
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/4 v6, 0x1

    .line 610
    if-ne p1, v6, :cond_0

    .line 611
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    if-eqz v0, :cond_0

    .line 612
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->D:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->N:I

    iget v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->M:I

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->b(II)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    move-result-object v1

    .line 614
    if-eqz v1, :cond_0

    move-object v0, p2

    .line 615
    check-cast v0, Lcom/qihoo/security/dialog/b;

    iget-object v2, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->b:Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/dialog/b;->setDialogTitle(Ljava/lang/CharSequence;)V

    .line 616
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->aa:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->o:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c00bd

    new-array v4, v6, [Ljava/lang/Object;

    iget-object v5, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->a:Ljava/lang/String;

    aput-object v5, v4, v8

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 618
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ab:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->o:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c00c0

    new-array v4, v6, [Ljava/lang/Object;

    iget v1, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->d:I

    int-to-long v6, v1

    invoke-virtual {p0, v6, v7}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(J)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v8

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 625
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/app/BaseActivity;->onPrepareDialog(ILandroid/app/Dialog;)V

    .line 626
    return-void
.end method

.method protected onResume()V
    .locals 3

    .prologue
    .line 354
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onResume()V

    .line 355
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->A:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ai:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$a;

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->ah:Landroid/content/IntentFilter;

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 356
    return-void
.end method

.method protected onStart()V
    .locals 0

    .prologue
    .line 346
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onStart()V

    .line 350
    return-void
.end method

.method public onStop()V
    .locals 0

    .prologue
    .line 374
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onStop()V

    .line 378
    return-void
.end method
