.class public Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/AbsListView$OnScrollListener;
.implements Lcom/qihoo/security/opti/trashclear/ui/a$c;
.implements Lcom/qihoo/security/opti/trashclear/ui/a$d;
.implements Lcom/qihoo360/mobilesafe/b/e$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$13;,
        Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;,
        Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/qihoo/security/app/BaseActivity;",
        "Landroid/view/View$OnClickListener;",
        "Landroid/widget/AbsListView$OnScrollListener;",
        "Lcom/qihoo/security/opti/trashclear/ui/a$c",
        "<",
        "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
        ">;",
        "Lcom/qihoo/security/opti/trashclear/ui/a$d",
        "<",
        "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
        ">;",
        "Lcom/qihoo360/mobilesafe/b/e$a;"
    }
.end annotation


# static fields
.field private static y:Ljava/lang/String;


# instance fields
.field private A:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private B:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private C:Landroid/view/View;

.field private D:Landroid/widget/ListView;

.field private E:Lcom/qihoo/security/ui/antivirus/list/c;

.field private F:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field private G:Lcom/qihoo/security/ui/antivirus/list/d;

.field private H:Landroid/widget/FrameLayout;

.field private I:Landroid/view/View;

.field private J:Landroid/view/View;

.field private K:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private L:I

.field private M:Lcom/qihoo360/mobilesafe/b/e;

.field private N:Z

.field private O:Z

.field private P:Lcom/qihoo/security/malware/a/b;

.field private Q:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

.field private R:Z

.field private S:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

.field private T:I

.field private U:Lcom/qihoo/security/opti/trashclear/ui/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;"
        }
    .end annotation
.end field

.field private V:Lcom/qihoo/security/ui/antivirus/list/a;

.field private final W:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field private final X:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final Y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field private final Z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;"
        }
    .end annotation
.end field

.field private aa:Lcom/qihoo/security/opti/trashclear/ui/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;"
        }
    .end annotation
.end field

.field private ab:I

.field private ac:Z

.field private ad:Z

.field private ae:Z

.field private af:Z

.field private ag:Z

.field private ah:Z

.field private ai:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

.field private final aj:Landroid/content/BroadcastReceiver;

.field private ak:Lcom/qihoo/security/ui/antivirus/list/PackageReceiver;

.field private al:Lcom/qihoo/security/ui/antivirus/list/b;

.field private am:Lcom/qihoo/security/dialog/g;

.field private an:Z

.field private ao:Z

.field private ap:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field private aq:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field private ar:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field private as:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field private at:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field private au:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field private av:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field private aw:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field private final ax:Lcom/qihoo/security/malware/a/a$a;

.field private final ay:Lcom/qihoo/security/ui/antivirus/list/a$a;

.field private final az:Lcom/qihoo/security/ui/antivirus/list/PackageReceiver$a;

.field private z:Landroid/widget/LinearLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 85
    const-string/jumbo v0, "VirusListActivity"

    sput-object v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->y:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 82
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    .line 99
    iput-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->F:Ljava/util/List;

    .line 113
    iput-boolean v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->N:Z

    .line 119
    sget-object v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;->d:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->Q:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    .line 122
    iput-boolean v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->R:Z

    .line 131
    sget-object v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->S:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    .line 140
    const/4 v0, -0x1

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->T:I

    .line 141
    iput-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->U:Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 147
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->W:Ljava/util/List;

    .line 149
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->X:Ljava/util/List;

    .line 151
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->Y:Ljava/util/List;

    .line 153
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->Z:Ljava/util/List;

    .line 157
    iput v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ab:I

    .line 165
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ai:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 167
    new-instance v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$1;-><init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->aj:Landroid/content/BroadcastReceiver;

    .line 1287
    new-instance v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$9;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$9;-><init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ax:Lcom/qihoo/security/malware/a/a$a;

    .line 1457
    new-instance v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$10;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$10;-><init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ay:Lcom/qihoo/security/ui/antivirus/list/a$a;

    .line 1505
    new-instance v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$11;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$11;-><init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->az:Lcom/qihoo/security/ui/antivirus/list/PackageReceiver$a;

    return-void
.end method

.method private A()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x0

    .line 1139
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "sp_key_virus_show_dialog_uninstall"

    invoke-static {v0, v1, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 1140
    new-instance v0, Lcom/qihoo/security/dialog/i;

    const v1, 0x7f0c0148

    const v2, 0x7f0c0149

    invoke-direct {v0, p0, v1, v2}, Lcom/qihoo/security/dialog/i;-><init>(Landroid/content/Context;II)V

    .line 1142
    new-array v1, v4, [I

    fill-array-data v1, :array_0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/i;->setButtonText([I)V

    .line 1143
    new-array v1, v4, [Landroid/view/View$OnClickListener;

    new-instance v2, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$3;

    invoke-direct {v2, p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$3;-><init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Lcom/qihoo/security/dialog/i;)V

    aput-object v2, v1, v3

    const/4 v2, 0x1

    new-instance v3, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$4;

    invoke-direct {v3, p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$4;-><init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Lcom/qihoo/security/dialog/i;)V

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/i;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 1156
    new-instance v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$5;

    invoke-direct {v1, p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$5;-><init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Lcom/qihoo/security/dialog/i;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/i;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 1167
    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/d;->a(Landroid/app/Dialog;)V

    .line 1168
    return-void

    .line 1142
    nop

    :array_0
    .array-data 4
        0x7f0c00ee
        0x7f0c014f
    .end array-data
.end method

.method private B()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x0

    .line 1174
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "sp_key_virus_show_dialog_forcestop"

    invoke-static {v0, v1, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 1175
    new-instance v0, Lcom/qihoo/security/dialog/i;

    const v1, 0x7f0c010b

    const v2, 0x7f0c014a

    invoke-direct {v0, p0, v1, v2}, Lcom/qihoo/security/dialog/i;-><init>(Landroid/content/Context;II)V

    .line 1177
    new-array v1, v4, [I

    fill-array-data v1, :array_0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/i;->setButtonText([I)V

    .line 1178
    new-array v1, v4, [Landroid/view/View$OnClickListener;

    new-instance v2, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$6;

    invoke-direct {v2, p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$6;-><init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Lcom/qihoo/security/dialog/i;)V

    aput-object v2, v1, v3

    const/4 v2, 0x1

    new-instance v3, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$7;

    invoke-direct {v3, p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$7;-><init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Lcom/qihoo/security/dialog/i;)V

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/i;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 1192
    new-instance v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$8;

    invoke-direct {v1, p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$8;-><init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Lcom/qihoo/security/dialog/i;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/i;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 1204
    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/d;->a(Landroid/app/Dialog;)V

    .line 1205
    return-void

    .line 1177
    nop

    :array_0
    .array-data 4
        0x7f0c0151
        0x7f0c014f
    .end array-data
.end method

.method private C()V
    .locals 5

    .prologue
    .line 1211
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->Z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1212
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ab:I

    .line 1214
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1215
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->Y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 1216
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1217
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 1218
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 1219
    iget-boolean v4, v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isInstalled:Z

    if-eqz v4, :cond_0

    .line 1220
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->Z:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1222
    :cond_0
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1223
    iget-object v0, v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->filePath:Ljava/lang/String;

    invoke-static {v0}, Lcom/qihoo360/common/utils/FileUtil;->deleteFile(Ljava/lang/String;)V

    .line 1224
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    iget v1, v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->_id:I

    invoke-static {v0, v1}, Lcom/qihoo/security/malware/db/a;->a(Landroid/content/Context;I)V

    .line 1225
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 1230
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/list/c;->b()I

    move-result v0

    .line 1232
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    if-ne v1, v0, :cond_2

    if-lez v0, :cond_2

    .line 1233
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->aw:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 1234
    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->g(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_1

    .line 1238
    :cond_2
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 1239
    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->f(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_2

    .line 1243
    :cond_3
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->N:Z

    if-eqz v0, :cond_7

    .line 1244
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->Z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 1245
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->P:Lcom/qihoo/security/malware/a/b;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->Z:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/malware/a/b;->a(Ljava/util/List;)V

    .line 1258
    :cond_4
    :goto_3
    return-void

    .line 1246
    :cond_5
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->an:Z

    if-eqz v0, :cond_6

    .line 1247
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->z()V

    goto :goto_3

    .line 1248
    :cond_6
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ao:Z

    if-eqz v0, :cond_4

    .line 1249
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->w:Lcom/qihoo/security/app/BaseActivity$a;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->w:Lcom/qihoo/security/app/BaseActivity$a;

    const/16 v2, 0x3e8

    invoke-virtual {v1, v2}, Lcom/qihoo/security/app/BaseActivity$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x190

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/app/BaseActivity$a;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_3

    .line 1252
    :cond_7
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->Z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 1253
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ac:Z

    .line 1254
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->P:Lcom/qihoo/security/malware/a/b;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->Z:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/malware/a/b;->a(Ljava/util/List;)V

    .line 1255
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->al:Lcom/qihoo/security/ui/antivirus/list/b;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/list/b;->a()V

    goto :goto_3
.end method

.method private D()V
    .locals 4

    .prologue
    .line 1264
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->X:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1265
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ab:I

    .line 1266
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->W:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 1267
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1268
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 1269
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 1270
    iget-boolean v3, v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isInstalled:Z

    if-eqz v3, :cond_0

    .line 1271
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->X:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1273
    :cond_0
    iget-object v3, v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->filePath:Ljava/lang/String;

    invoke-static {v3}, Lcom/qihoo360/common/utils/FileUtil;->deleteFile(Ljava/lang/String;)V

    .line 1274
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    iget v1, v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->_id:I

    invoke-static {v3, v1}, Lcom/qihoo/security/malware/db/a;->a(Landroid/content/Context;I)V

    .line 1275
    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->f(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 1276
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 1279
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->X:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 1280
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ad:Z

    .line 1281
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->W:Ljava/util/List;

    iget v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ab:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->aa:Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 1282
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->aa:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-object v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 1283
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->al:Lcom/qihoo/security/ui/antivirus/list/b;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/list/b;->b()V

    .line 1285
    :cond_2
    return-void
.end method

.method private E()V
    .locals 4

    .prologue
    const/4 v3, -0x1

    .line 1350
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->al:Lcom/qihoo/security/ui/antivirus/list/b;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/list/b;->e()V

    .line 1351
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ah:Z

    if-eqz v0, :cond_2

    .line 1352
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ag:Z

    if-nez v0, :cond_0

    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ai:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-ne v0, v1, :cond_1

    .line 1353
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string/jumbo v1, "is_deep_scan"

    iget-boolean v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->O:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v3, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->setResult(ILandroid/content/Intent;)V

    .line 1360
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->finish()V

    .line 1361
    return-void

    .line 1356
    :cond_2
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ag:Z

    if-eqz v0, :cond_1

    .line 1357
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string/jumbo v1, "is_deep_scan"

    iget-boolean v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->O:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v3, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->setResult(ILandroid/content/Intent;)V

    goto :goto_0
.end method

.method private a(Landroid/content/Intent;Z)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 257
    const-string/jumbo v0, "is_deep_scan"

    invoke-virtual {p1, v0, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->O:Z

    .line 258
    const-string/jumbo v0, "color"

    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080057

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->L:I

    .line 259
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 260
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_RISKY_APP"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 261
    sget-object v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;->b:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->S:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    .line 268
    :cond_0
    :goto_0
    const-string/jumbo v0, "from_notify"

    invoke-virtual {p1, v0, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    .line 269
    if-eqz v0, :cond_1

    .line 270
    invoke-static {}, Lcom/qihoo/security/ui/result/f;->a()Lcom/qihoo/security/ui/result/f;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/result/f;->a(I)V

    .line 273
    :cond_1
    if-eqz p2, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->F:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 274
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->t()V

    .line 281
    :cond_2
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    const/16 v1, 0x1001

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->b(I)V

    .line 282
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    const/16 v1, 0x1002

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->b(I)V

    .line 283
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    const/16 v1, 0x100d

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->b(I)V

    .line 284
    return-void

    .line 262
    :cond_3
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_ADV_APP"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 263
    sget-object v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;->c:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->S:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    goto :goto_0

    .line 264
    :cond_4
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_MALWARE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 265
    sget-object v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;->d:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->S:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    goto :goto_0
.end method

.method private a(Lcom/qihoo/security/leak/c;)V
    .locals 3

    .prologue
    .line 559
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 560
    const-string/jumbo v1, "extra_leak_id"

    invoke-virtual {p1}, Lcom/qihoo/security/leak/c;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 561
    const/16 v1, 0xc8

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 562
    return-void
.end method

.method private a(Lcom/qihoo/security/malware/vo/MaliciousInfo;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 546
    iput-boolean v3, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->af:Z

    .line 547
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/ui/antivirus/MalwareDetailActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 548
    const-string/jumbo v1, "extra_detail_info"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 549
    const-string/jumbo v1, "extra_from_virus_list"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 550
    const/16 v1, 0x64

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 551
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->q()V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->f(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    return-void
.end method

.method private a([I)V
    .locals 7

    .prologue
    const v5, 0x7f0f0003

    const/4 v3, 0x4

    const/4 v2, 0x3

    const/4 v4, 0x1

    const/4 v6, 0x0

    .line 441
    aget v0, p1, v6

    aget v1, p1, v4

    add-int/2addr v0, v1

    const/4 v1, 0x2

    aget v1, p1, v1

    add-int/2addr v0, v1

    aget v1, p1, v2

    add-int/2addr v0, v1

    aget v1, p1, v3

    add-int/2addr v0, v1

    .line 442
    if-nez v0, :cond_0

    .line 462
    :goto_0
    return-void

    .line 443
    :cond_0
    aget v1, p1, v6

    if-lez v1, :cond_1

    .line 445
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->A:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->o:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c0121

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 446
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->B:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->o:Lcom/qihoo/security/locale/d;

    new-array v3, v4, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {v2, v5, v0, v3}, Lcom/qihoo/security/locale/d;->a(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 448
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)V

    .line 449
    const/16 v0, 0x36cf

    aget v1, p1, v6

    invoke-static {v0, v1}, Lcom/qihoo/security/support/b;->b(II)V

    goto :goto_0

    .line 450
    :cond_1
    aget v1, p1, v2

    aget v2, p1, v3

    add-int/2addr v1, v2

    if-nez v1, :cond_2

    .line 451
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->A:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->o:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c0138

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 452
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->B:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->o:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0f0002

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-virtual {v2, v3, v0, v4}, Lcom/qihoo/security/locale/d;->a(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 454
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)V

    goto :goto_0

    .line 457
    :cond_2
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->A:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->o:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c0122

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 458
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->B:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->o:Lcom/qihoo/security/locale/d;

    new-array v3, v4, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {v2, v5, v0, v3}, Lcom/qihoo/security/locale/d;->a(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 460
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->NEED_OPTIMIZE:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)V

    goto/16 :goto_0
.end method

.method private a([I[I)V
    .locals 7

    .prologue
    const/4 v6, 0x2

    const/4 v2, 0x1

    const/4 v5, 0x4

    const/4 v4, 0x3

    const/4 v3, 0x0

    .line 477
    aget v0, p1, v3

    aget v1, p1, v2

    add-int/2addr v0, v1

    aget v1, p1, v6

    add-int/2addr v0, v1

    aget v1, p1, v4

    add-int/2addr v0, v1

    aget v1, p1, v5

    add-int/2addr v0, v1

    .line 478
    aget v1, p2, v3

    aget v2, p2, v2

    add-int/2addr v1, v2

    aget v2, p2, v6

    add-int/2addr v1, v2

    aget v2, p2, v4

    add-int/2addr v1, v2

    aget v2, p2, v5

    add-int/2addr v1, v2

    .line 479
    if-lez v0, :cond_3

    .line 480
    if-nez v1, :cond_1

    .line 481
    aget v0, p1, v3

    aget v1, p1, v4

    add-int/2addr v0, v1

    aget v1, p1, v5

    add-int/2addr v0, v1

    if-nez v0, :cond_0

    .line 482
    sget-object v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;->d:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->Q:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    .line 497
    :goto_0
    sget-object v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$13;->b:[I

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->Q:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    invoke-virtual {v1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 513
    :goto_1
    return-void

    .line 484
    :cond_0
    sget-object v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;->c:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->Q:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    goto :goto_0

    .line 487
    :cond_1
    if-ne v1, v0, :cond_2

    .line 488
    sget-object v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->Q:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    goto :goto_0

    .line 490
    :cond_2
    sget-object v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;->b:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->Q:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    goto :goto_0

    .line 494
    :cond_3
    sget-object v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;->d:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->Q:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    goto :goto_0

    .line 499
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->K:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c0146

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    goto :goto_1

    .line 502
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->K:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c0147

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    goto :goto_1

    .line 505
    :pswitch_2
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->K:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c0100

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    goto :goto_1

    .line 508
    :pswitch_3
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->K:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c0155

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    goto :goto_1

    .line 497
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic a(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Z)Z
    .locals 0

    .prologue
    .line 82
    iput-boolean p1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ae:Z

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Landroid/view/View;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->I:Landroid/view/View;

    return-object v0
.end method

.method private b(Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 376
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->U:Lcom/qihoo/security/opti/trashclear/ui/i;

    if-nez v0, :cond_1

    .line 387
    :cond_0
    :goto_0
    return-void

    .line 379
    :cond_1
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    .line 380
    if-eqz v0, :cond_2

    .line 381
    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->b(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_0

    .line 384
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->U:Lcom/qihoo/security/opti/trashclear/ui/i;

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    if-eqz v0, :cond_0

    .line 385
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->I:Landroid/view/View;

    invoke-virtual {v0, v1, p1}, Lcom/qihoo/security/ui/antivirus/list/c;->a(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->g(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Z)Z
    .locals 0

    .prologue
    .line 82
    iput-boolean p1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ac:Z

    return p1
.end method

.method static synthetic c(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Lcom/qihoo/security/opti/trashclear/ui/i;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->U:Lcom/qihoo/security/opti/trashclear/ui/i;

    return-object v0
.end method

.method private c(Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 521
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->aa:Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 522
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 523
    sget-object v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$13;->a:[I

    iget-object v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->groupType:Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;

    invoke-virtual {v2}, Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 538
    :goto_0
    return-void

    .line 527
    :pswitch_0
    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->a(Lcom/qihoo/security/malware/vo/MaliciousInfo;)V

    goto :goto_0

    .line 530
    :pswitch_1
    iget-object v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->leakItem:Lcom/qihoo/security/leak/c;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->a(Lcom/qihoo/security/leak/c;)V

    goto :goto_0

    .line 533
    :pswitch_2
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->d(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_0

    .line 523
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic c(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->h(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    return-void
.end method

.method static synthetic c(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Z)Z
    .locals 0

    .prologue
    .line 82
    iput-boolean p1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ad:Z

    return p1
.end method

.method static synthetic d(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Lcom/qihoo/security/ui/antivirus/list/d;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->G:Lcom/qihoo/security/ui/antivirus/list/d;

    return-object v0
.end method

.method private d(Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 605
    const/16 v0, 0x36c4

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 606
    new-instance v0, Lcom/qihoo/security/ui/antivirus/a;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/antivirus/a;-><init>(Landroid/content/Context;)V

    .line 607
    const v1, 0x7f0c0108

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/antivirus/a;->setDialogTitle(I)V

    .line 608
    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/a;->c()V

    .line 609
    invoke-virtual {v0, v3}, Lcom/qihoo/security/ui/antivirus/a;->setCancelable(Z)V

    .line 610
    new-array v1, v3, [I

    const v2, 0x7f0c0109

    aput v2, v1, v4

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/antivirus/a;->setButtonText([I)V

    .line 611
    new-array v1, v3, [Landroid/view/View$OnClickListener;

    new-instance v2, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$17;

    invoke-direct {v2, p0, v0, p1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$17;-><init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Lcom/qihoo/security/ui/antivirus/a;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    aput-object v2, v1, v4

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/antivirus/a;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 626
    new-instance v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$18;

    invoke-direct {v1, p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$18;-><init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Lcom/qihoo/security/ui/antivirus/a;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/antivirus/a;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 637
    new-instance v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$19;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$19;-><init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/antivirus/a;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 644
    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/d;->a(Landroid/app/Dialog;)V

    .line 645
    return-void
.end method

.method static synthetic d(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Z)Z
    .locals 0

    .prologue
    .line 82
    iput-boolean p1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->af:Z

    return p1
.end method

.method private e(Lcom/qihoo/security/opti/trashclear/ui/i;)Lcom/qihoo/security/opti/trashclear/ui/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 914
    if-nez p1, :cond_1

    .line 915
    const/4 p1, 0x0

    .line 919
    :cond_0
    :goto_0
    return-object p1

    .line 916
    :cond_1
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 919
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->e(Lcom/qihoo/security/opti/trashclear/ui/i;)Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object p1

    goto :goto_0
.end method

.method static synthetic e(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->r()V

    return-void
.end method

.method private f(Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v4, 0x1

    .line 1406
    if-eqz p1, :cond_3

    .line 1407
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1408
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v1

    .line 1409
    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v2

    .line 1410
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1414
    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->d()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1415
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ne v2, v4, :cond_0

    .line 1416
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1417
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1428
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 1429
    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->g(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_1

    .line 1419
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1422
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ne v2, v4, :cond_2

    .line 1423
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1425
    :cond_2
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->h(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_0

    .line 1432
    :cond_3
    return-void
.end method

.method static synthetic f(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->t()V

    return-void
.end method

.method static synthetic g(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Lcom/qihoo/security/opti/trashclear/ui/i;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->aa:Lcom/qihoo/security/opti/trashclear/ui/i;

    return-object v0
.end method

.method private g(Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1440
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/ui/antivirus/list/c;->e(Lcom/qihoo/security/opti/trashclear/ui/i;)I

    move-result v0

    .line 1441
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->D:Landroid/widget/ListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getLastVisiblePosition()I

    move-result v1

    .line 1445
    if-gt v0, v1, :cond_1

    .line 1446
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->D:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 1447
    if-nez v0, :cond_0

    .line 1448
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->V:Lcom/qihoo/security/ui/antivirus/list/a;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/ui/antivirus/list/a;->a(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 1455
    :goto_0
    return-void

    .line 1450
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->V:Lcom/qihoo/security/ui/antivirus/list/a;

    invoke-virtual {v1, v0, p1}, Lcom/qihoo/security/ui/antivirus/list/a;->a(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_0

    .line 1453
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->V:Lcom/qihoo/security/ui/antivirus/list/a;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/ui/antivirus/list/a;->a(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_0
.end method

.method static synthetic h(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Lcom/qihoo/security/ui/antivirus/list/c;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    return-object v0
.end method

.method private h(Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1493
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 1494
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/ui/antivirus/list/c;->a(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 1495
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/qihoo/security/ui/antivirus/list/c;->a(Lcom/qihoo/security/opti/trashclear/ui/i;I)V

    .line 1496
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->I:Landroid/view/View;

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->U:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/ui/antivirus/list/c;->a(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 1497
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->s()V

    .line 1498
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/list/c;->getCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 1499
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ag:Z

    .line 1500
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E()V

    .line 1503
    :cond_0
    return-void
.end method

.method static synthetic i(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->C()V

    return-void
.end method

.method static synthetic j(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->D()V

    return-void
.end method

.method static synthetic k(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Ljava/util/List;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->W:Ljava/util/List;

    return-object v0
.end method

.method static synthetic l(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->B()V

    return-void
.end method

.method static synthetic m(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Z
    .locals 1

    .prologue
    .line 82
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->N:Z

    return v0
.end method

.method static synthetic n(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Ljava/util/List;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->Y:Ljava/util/List;

    return-object v0
.end method

.method private o()V
    .locals 3

    .prologue
    .line 230
    const v0, 0x7f0b00eb

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->z:Landroid/widget/LinearLayout;

    .line 231
    const v0, 0x7f0b0228

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->B:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 232
    const v0, 0x7f0b0227

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->A:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 235
    const v0, 0x7f0b009b

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->C:Landroid/view/View;

    .line 236
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->C:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 238
    const v0, 0x7f0b00f3

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->J:Landroid/view/View;

    .line 239
    const v0, 0x7f0b00f2

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->D:Landroid/widget/ListView;

    .line 241
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->D:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 243
    const v0, 0x7f0b00f4

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->H:Landroid/widget/FrameLayout;

    .line 244
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    const v1, 0x7f0300ad

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->H:Landroid/widget/FrameLayout;

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->I:Landroid/view/View;

    .line 245
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->I:Landroid/view/View;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$12;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$12;-><init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 252
    const v0, 0x7f0b00f6

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->K:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 253
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->K:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 254
    return-void
.end method

.method static synthetic o(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->z()V

    return-void
.end method

.method static synthetic p(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Lcom/qihoo/security/app/BaseActivity$a;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->w:Lcom/qihoo/security/app/BaseActivity$a;

    return-object v0
.end method

.method private p()V
    .locals 3

    .prologue
    .line 287
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->L:I

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->setColor(I)V

    .line 288
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a;->c(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->N:Z

    .line 289
    new-instance v0, Lcom/qihoo/security/malware/a/b;

    iget-boolean v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->N:Z

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ax:Lcom/qihoo/security/malware/a/a$a;

    invoke-direct {v0, p0, v1, v2}, Lcom/qihoo/security/malware/a/b;-><init>(Landroid/content/Context;ZLcom/qihoo/security/malware/a/a$a;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->P:Lcom/qihoo/security/malware/a/b;

    .line 290
    new-instance v0, Lcom/qihoo360/mobilesafe/b/e;

    iget v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->L:I

    invoke-direct {v0, v1}, Lcom/qihoo360/mobilesafe/b/e;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->M:Lcom/qihoo360/mobilesafe/b/e;

    .line 291
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->M:Lcom/qihoo360/mobilesafe/b/e;

    invoke-virtual {v0, p0}, Lcom/qihoo360/mobilesafe/b/e;->a(Lcom/qihoo360/mobilesafe/b/e$a;)V

    .line 292
    new-instance v0, Lcom/qihoo/security/ui/antivirus/list/d;

    invoke-direct {v0}, Lcom/qihoo/security/ui/antivirus/list/d;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->G:Lcom/qihoo/security/ui/antivirus/list/d;

    .line 293
    return-void
.end method

.method static synthetic q(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Lcom/qihoo/security/malware/a/b;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->P:Lcom/qihoo/security/malware/a/b;

    return-object v0
.end method

.method private q()V
    .locals 2

    .prologue
    .line 299
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ae:Z

    if-eqz v0, :cond_0

    .line 317
    :goto_0
    return-void

    .line 302
    :cond_0
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/p;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$14;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$14;-><init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method private r()V
    .locals 3

    .prologue
    .line 323
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->G:Lcom/qihoo/security/ui/antivirus/list/d;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/list/d;->a()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->F:Ljava/util/List;

    .line 325
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->F:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->F:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 326
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ag:Z

    .line 327
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E()V

    .line 340
    :goto_0
    return-void

    .line 331
    :cond_1
    new-instance v0, Lcom/qihoo/security/ui/antivirus/list/c;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->F:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/ui/antivirus/list/c;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    .line 332
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->D:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 334
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/ui/antivirus/list/c;->a(Lcom/qihoo/security/opti/trashclear/ui/a$c;)V

    .line 335
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/ui/antivirus/list/c;->a(Lcom/qihoo/security/opti/trashclear/ui/a$d;)V

    .line 337
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->s()V

    .line 339
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->C:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method static synthetic r(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Z
    .locals 1

    .prologue
    .line 82
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ac:Z

    return v0
.end method

.method static synthetic s(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)I
    .locals 1

    .prologue
    .line 82
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ab:I

    return v0
.end method

.method private s()V
    .locals 11

    .prologue
    const/4 v10, 0x4

    const/4 v9, 0x3

    const/4 v8, 0x1

    const/4 v7, 0x2

    const/4 v6, 0x0

    .line 400
    const/4 v0, 0x5

    new-array v2, v0, [I

    .line 401
    const/4 v0, 0x5

    new-array v3, v0, [I

    .line 402
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->F:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 403
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 404
    sget-object v5, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$13;->a:[I

    iget-object v1, v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->groupType:Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;

    invoke-virtual {v1}, Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;->ordinal()I

    move-result v1

    aget v1, v5, v1

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 406
    :pswitch_0
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    aput v1, v2, v6

    .line 407
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->g(Lcom/qihoo/security/opti/trashclear/ui/i;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    aput v0, v3, v6

    goto :goto_0

    .line 410
    :pswitch_1
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    .line 411
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 412
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 413
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    aput v1, v2, v7

    .line 414
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->g(Lcom/qihoo/security/opti/trashclear/ui/i;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    aput v0, v3, v7

    goto :goto_0

    .line 416
    :cond_0
    aput v6, v2, v7

    .line 417
    aput v6, v3, v7

    goto :goto_0

    .line 421
    :pswitch_2
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    aput v1, v2, v8

    .line 422
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->g(Lcom/qihoo/security/opti/trashclear/ui/i;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    aput v0, v3, v8

    goto :goto_0

    .line 425
    :pswitch_3
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    aput v1, v2, v9

    .line 426
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->g(Lcom/qihoo/security/opti/trashclear/ui/i;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    aput v0, v3, v9

    goto/16 :goto_0

    .line 429
    :pswitch_4
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    aput v1, v2, v10

    .line 430
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->g(Lcom/qihoo/security/opti/trashclear/ui/i;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    aput v0, v3, v10

    goto/16 :goto_0

    .line 436
    :cond_1
    invoke-direct {p0, v2}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->a([I)V

    .line 437
    invoke-direct {p0, v2, v3}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->a([I[I)V

    .line 438
    return-void

    .line 404
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method static synthetic t(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Lcom/qihoo/security/ui/antivirus/list/b;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->al:Lcom/qihoo/security/ui/antivirus/list/b;

    return-object v0
.end method

.method private t()V
    .locals 4

    .prologue
    .line 648
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->F:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 649
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 650
    iget v3, v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isExpand:I

    if-eqz v3, :cond_0

    .line 653
    sget-object v3, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$13;->a:[I

    iget-object v1, v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->groupType:Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;

    invoke-virtual {v1}, Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;->ordinal()I

    move-result v1

    aget v1, v3, v1

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 655
    :pswitch_0
    sget-object v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;->c:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->S:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    if-eq v1, v3, :cond_1

    sget-object v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;->b:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->S:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    if-ne v1, v3, :cond_2

    .line 656
    :cond_1
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 657
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->b(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_0

    .line 659
    :cond_2
    sget-object v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;->d:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->S:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    if-ne v1, v3, :cond_3

    .line 660
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->d()Z

    move-result v1

    if-nez v1, :cond_0

    .line 661
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->b(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_0

    .line 664
    :cond_3
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->b(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_0

    .line 669
    :pswitch_1
    sget-object v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;->c:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->S:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    if-eq v1, v3, :cond_4

    sget-object v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;->b:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->S:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    if-ne v1, v3, :cond_6

    .line 670
    :cond_4
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->d()Z

    move-result v1

    if-nez v1, :cond_5

    .line 671
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->b(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 673
    :cond_5
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    .line 674
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 675
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 679
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->d()Z

    move-result v1

    if-nez v1, :cond_0

    .line 680
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->b(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto/16 :goto_0

    .line 683
    :cond_6
    sget-object v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;->d:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->S:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    if-ne v1, v3, :cond_7

    .line 684
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 685
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->b(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto/16 :goto_0

    .line 688
    :cond_7
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->b(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto/16 :goto_0

    .line 693
    :pswitch_2
    sget-object v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;->c:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->S:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    if-eq v1, v3, :cond_8

    sget-object v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;->b:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->S:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    if-eq v1, v3, :cond_8

    sget-object v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;->d:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->S:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$a;

    if-ne v1, v3, :cond_9

    .line 695
    :cond_8
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 696
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->b(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto/16 :goto_0

    .line 699
    :cond_9
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->b(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto/16 :goto_0

    .line 706
    :cond_a
    return-void

    .line 653
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method private u()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 898
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->D:Landroid/widget/ListView;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->D:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getChildCount()I

    move-result v0

    if-lez v0, :cond_2

    .line 899
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/list/c;->getCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 900
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->U:Lcom/qihoo/security/opti/trashclear/ui/i;

    if-nez v0, :cond_0

    .line 901
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/antivirus/list/c;->a(I)Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->U:Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 903
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->U:Lcom/qihoo/security/opti/trashclear/ui/i;

    if-eqz v0, :cond_1

    .line 904
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->H:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 905
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->I:Landroid/view/View;

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->U:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/ui/antivirus/list/c;->a(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 911
    :cond_1
    :goto_0
    return-void

    .line 909
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->H:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method static synthetic u(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Z
    .locals 1

    .prologue
    .line 82
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ad:Z

    return v0
.end method

.method private v()V
    .locals 1

    .prologue
    .line 956
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->Y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 957
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->W:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 959
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ap:Ljava/util/List;

    .line 960
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->aq:Ljava/util/List;

    .line 961
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ar:Ljava/util/List;

    .line 962
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->as:Ljava/util/List;

    .line 964
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->at:Ljava/util/List;

    .line 965
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->au:Ljava/util/List;

    .line 966
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->av:Ljava/util/List;

    .line 967
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->aw:Ljava/util/List;

    .line 968
    return-void
.end method

.method static synthetic v(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Z
    .locals 1

    .prologue
    .line 82
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->af:Z

    return v0
.end method

.method static synthetic w(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Lcom/qihoo/security/app/BaseActivity$a;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->w:Lcom/qihoo/security/app/BaseActivity$a;

    return-object v0
.end method

.method private w()V
    .locals 5

    .prologue
    .line 971
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->F:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 972
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 973
    sget-object v3, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$13;->a:[I

    iget-object v1, v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->groupType:Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;

    invoke-virtual {v1}, Lcom/qihoo/security/malware/vo/MaliciousInfo$GroupType;->ordinal()I

    move-result v1

    aget v1, v3, v1

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 975
    :pswitch_0
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->g(Lcom/qihoo/security/opti/trashclear/ui/i;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->as:Ljava/util/List;

    .line 976
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->h(Lcom/qihoo/security/opti/trashclear/ui/i;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->aw:Ljava/util/List;

    goto :goto_0

    .line 979
    :pswitch_1
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    .line 980
    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_0

    .line 981
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    const/4 v4, 0x0

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-virtual {v3, v1}, Lcom/qihoo/security/ui/antivirus/list/c;->g(Lcom/qihoo/security/opti/trashclear/ui/i;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ar:Ljava/util/List;

    .line 983
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->h(Lcom/qihoo/security/opti/trashclear/ui/i;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->av:Ljava/util/List;

    goto :goto_0

    .line 986
    :pswitch_2
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->g(Lcom/qihoo/security/opti/trashclear/ui/i;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ar:Ljava/util/List;

    goto :goto_0

    .line 989
    :pswitch_3
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->g(Lcom/qihoo/security/opti/trashclear/ui/i;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ap:Ljava/util/List;

    .line 990
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->h(Lcom/qihoo/security/opti/trashclear/ui/i;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->at:Ljava/util/List;

    goto :goto_0

    .line 993
    :pswitch_4
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->g(Lcom/qihoo/security/opti/trashclear/ui/i;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->aq:Ljava/util/List;

    .line 994
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/antivirus/list/c;->h(Lcom/qihoo/security/opti/trashclear/ui/i;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->au:Ljava/util/List;

    goto :goto_0

    .line 1000
    :cond_1
    return-void

    .line 973
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private x()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 1006
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->v()V

    .line 1007
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->w()V

    .line 1009
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ap:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->aq:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->as:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ar:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    .line 1010
    if-nez v0, :cond_0

    .line 1011
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c010c

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    .line 1033
    :goto_0
    return-void

    .line 1015
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ap:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->aq:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ar:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v1, v2

    if-nez v1, :cond_1

    .line 1016
    iput-boolean v3, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->an:Z

    .line 1021
    :goto_1
    const/16 v1, 0x36d0

    invoke-static {v1, v0}, Lcom/qihoo/security/support/b;->b(II)V

    .line 1022
    const/16 v0, 0x37dd

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 1024
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->as:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 1025
    iput-boolean v4, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ao:Z

    .line 1026
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->am:Lcom/qihoo/security/dialog/g;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/d;->a(Landroid/app/Dialog;)V

    .line 1027
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->Y:Ljava/util/List;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->as:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1028
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->C()V

    goto :goto_0

    .line 1018
    :cond_1
    iput-boolean v4, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->an:Z

    goto :goto_1

    .line 1030
    :cond_2
    iput-boolean v3, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ao:Z

    .line 1031
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->z()V

    goto :goto_0
.end method

.method private y()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 1039
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->v()V

    .line 1040
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->w()V

    .line 1042
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ap:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->aq:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->as:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ar:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    .line 1043
    if-nez v0, :cond_1

    .line 1044
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c010c

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    .line 1077
    :cond_0
    :goto_0
    return-void

    .line 1048
    :cond_1
    const/16 v1, 0x36d0

    invoke-static {v1, v0}, Lcom/qihoo/security/support/b;->b(II)V

    .line 1049
    const/16 v0, 0x37dd

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 1051
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->z()V

    .line 1053
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->as:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 1054
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 1055
    iget-boolean v1, v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isSystem:Z

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->N:Z

    if-nez v1, :cond_2

    .line 1056
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->W:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1058
    :cond_2
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->Y:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1062
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->Y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 1063
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->N:Z

    if-eqz v0, :cond_4

    .line 1064
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->C()V

    goto :goto_0

    .line 1065
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "sp_key_virus_show_dialog_uninstall"

    invoke-static {v0, v1, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1066
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->A()V

    goto :goto_0

    .line 1068
    :cond_5
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->C()V

    goto :goto_0

    .line 1070
    :cond_6
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->W:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1071
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "sp_key_virus_show_dialog_forcestop"

    invoke-static {v0, v1, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1072
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->B()V

    goto :goto_0

    .line 1074
    :cond_7
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->D()V

    goto :goto_0
.end method

.method private z()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 1084
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ap:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 1085
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ap:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 1086
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-object v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->leakItem:Lcom/qihoo/security/leak/c;

    .line 1087
    invoke-virtual {v0}, Lcom/qihoo/security/leak/c;->f()Z

    goto :goto_0

    .line 1089
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->at:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 1090
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->at:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 1091
    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->g(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_1

    .line 1094
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ap:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 1095
    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->h(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_2

    .line 1100
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->aq:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 1101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "setting_auto_start"

    invoke-static {v0, v1, v4}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 1102
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->au:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 1103
    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->g(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_3

    .line 1107
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ar:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_8

    .line 1108
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1109
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ar:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 1110
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 1111
    iget-boolean v3, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isInstalled:Z

    if-eqz v3, :cond_4

    .line 1112
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 1114
    :cond_4
    iget-object v3, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->filePath:Ljava/lang/String;

    invoke-static {v3}, Lcom/qihoo360/common/utils/FileUtil;->deleteFile(Ljava/lang/String;)V

    .line 1115
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    iget v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->_id:I

    invoke-static {v3, v0}, Lcom/qihoo/security/malware/db/a;->a(Landroid/content/Context;I)V

    goto :goto_4

    .line 1118
    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->av:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 1119
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->av:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 1120
    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->g(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_5

    .line 1123
    :cond_6
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ar:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 1124
    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->h(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_6

    .line 1127
    :cond_7
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    invoke-static {v0, v1, v4}, Lcom/qihoo/security/malware/db/c;->a(Landroid/content/Context;Ljava/util/List;Z)V

    .line 1130
    :cond_8
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->N:Z

    if-eqz v0, :cond_9

    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ao:Z

    if-eqz v0, :cond_9

    .line 1131
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->w:Lcom/qihoo/security/app/BaseActivity$a;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->w:Lcom/qihoo/security/app/BaseActivity$a;

    const/16 v2, 0x3e8

    invoke-virtual {v1, v2}, Lcom/qihoo/security/app/BaseActivity$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x190

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/app/BaseActivity$a;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1133
    :cond_9
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .prologue
    .line 1337
    return-void
.end method

.method protected a(Landroid/os/Message;)V
    .locals 1

    .prologue
    .line 807
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    .line 826
    :goto_0
    return-void

    .line 809
    :sswitch_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->al:Lcom/qihoo/security/ui/antivirus/list/b;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/list/b;->c()V

    goto :goto_0

    .line 812
    :sswitch_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->al:Lcom/qihoo/security/ui/antivirus/list/b;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/list/b;->e()V

    goto :goto_0

    .line 815
    :sswitch_2
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->al:Lcom/qihoo/security/ui/antivirus/list/b;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/list/b;->d()V

    goto :goto_0

    .line 818
    :sswitch_3
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->al:Lcom/qihoo/security/ui/antivirus/list/b;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/list/b;->e()V

    goto :goto_0

    .line 821
    :sswitch_4
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->am:Lcom/qihoo/security/dialog/g;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/d;->b(Landroid/app/Dialog;)V

    goto :goto_0

    .line 807
    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
        0x66 -> :sswitch_1
        0x67 -> :sswitch_2
        0x68 -> :sswitch_3
        0x3e8 -> :sswitch_4
    .end sparse-switch
.end method

.method public a(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 344
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isExpand:I

    packed-switch v0, :pswitch_data_0

    .line 360
    :goto_0
    invoke-direct {p0, p2}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->b(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 361
    return-void

    .line 349
    :pswitch_0
    invoke-direct {p0, p2}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->c(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_0

    .line 352
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/ui/antivirus/list/c;->b(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_0

    .line 355
    :pswitch_2
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/ui/antivirus/list/c;->b(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_0

    .line 344
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public a(Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 365
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/ui/antivirus/list/c;->f(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 366
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->b(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 367
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->s()V

    .line 368
    return-void
.end method

.method public a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)V
    .locals 2

    .prologue
    .line 1320
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ai:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 1321
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/qihoo360/mobilesafe/b/c;->a(Landroid/content/Context;Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v0

    .line 1322
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->M:Lcom/qihoo360/mobilesafe/b/e;

    invoke-virtual {v1, v0}, Lcom/qihoo360/mobilesafe/b/e;->a(I)V

    .line 1323
    iput v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->L:I

    .line 1324
    return-void
.end method

.method public finish()V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1364
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 1365
    if-eqz v3, :cond_1

    const-string/jumbo v0, "from_notify"

    invoke-virtual {v3, v0, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1366
    const-class v0, Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-virtual {v3, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1367
    const-string/jumbo v0, "fragment_index"

    const/4 v4, 0x2

    invoke-virtual {v3, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1368
    const/high16 v0, 0x14000000

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1369
    const-string/jumbo v4, "jump_result_page"

    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->R:Z

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {v3, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1370
    const-string/jumbo v0, "from_notify"

    invoke-virtual {v3, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1371
    const-string/jumbo v0, "reset_main_page"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1372
    invoke-virtual {p0, v3}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->startActivity(Landroid/content/Intent;)V

    .line 1373
    iput-boolean v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->R:Z

    .line 1377
    :goto_1
    return-void

    :cond_0
    move v0, v2

    .line 1369
    goto :goto_0

    .line 1375
    :cond_1
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->finish()V

    goto :goto_1
.end method

.method protected j()V
    .locals 2

    .prologue
    .line 222
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->j()V

    .line 223
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->r:Landroid/support/v7/app/ActionBar;

    if-eqz v0, :cond_0

    .line 224
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    iget v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->L:I

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->a(Landroid/graphics/drawable/Drawable;)V

    .line 225
    const v0, 0x7f0c0101

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->b(I)V

    .line 227
    :cond_0
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .prologue
    const-wide/16 v2, 0x190

    .line 566
    invoke-super {p0, p1, p2, p3}, Lcom/qihoo/security/app/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 570
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 571
    sparse-switch p1, :sswitch_data_0

    .line 597
    :goto_0
    return-void

    .line 573
    :sswitch_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->w:Lcom/qihoo/security/app/BaseActivity$a;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$15;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$15;-><init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/app/BaseActivity$a;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 581
    :sswitch_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->w:Lcom/qihoo/security/app/BaseActivity$a;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$16;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$16;-><init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/app/BaseActivity$a;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 589
    :sswitch_2
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->q()V

    goto :goto_0

    .line 595
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->af:Z

    goto :goto_0

    .line 571
    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_0
        0xc8 -> :sswitch_1
        0x12c -> :sswitch_2
    .end sparse-switch
.end method

.method public onBackPressed()V
    .locals 1

    .prologue
    .line 1341
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->R:Z

    .line 1342
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E()V

    .line 1343
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 925
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 941
    :goto_0
    return-void

    .line 928
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 930
    :pswitch_0
    sget-object v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;->d:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->Q:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$b;

    if-ne v0, v1, :cond_1

    .line 931
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E()V

    goto :goto_0

    .line 932
    :cond_1
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->N:Z

    if-eqz v0, :cond_2

    .line 933
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->x()V

    goto :goto_0

    .line 935
    :cond_2
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->y()V

    goto :goto_0

    .line 928
    nop

    :pswitch_data_0
    .packed-switch 0x7f0b00f6
        :pswitch_0
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 189
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 190
    const v0, 0x7f0300aa

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->setContentView(I)V

    .line 191
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->a(Landroid/content/Intent;Z)V

    .line 192
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->o()V

    .line 193
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p()V

    .line 194
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->q()V

    .line 196
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 197
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/a;->g(Landroid/content/Context;)V

    .line 199
    new-instance v0, Landroid/content/IntentFilter;

    const-string/jumbo v1, "com.qihoo.security.FINISH_MAIN_SCREEN"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 200
    const-string/jumbo v1, "com.qihoo.action.MONITOR_UPDATE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 201
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->x:Landroid/support/v4/content/g;

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->aj:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/support/v4/content/g;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 207
    new-instance v0, Lcom/qihoo/security/ui/antivirus/list/PackageReceiver;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->az:Lcom/qihoo/security/ui/antivirus/list/PackageReceiver$a;

    invoke-direct {v0, v1}, Lcom/qihoo/security/ui/antivirus/list/PackageReceiver;-><init>(Lcom/qihoo/security/ui/antivirus/list/PackageReceiver$a;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ak:Lcom/qihoo/security/ui/antivirus/list/PackageReceiver;

    .line 208
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ak:Lcom/qihoo/security/ui/antivirus/list/PackageReceiver;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/antivirus/list/PackageReceiver;->a(Landroid/content/Context;)V

    .line 210
    new-instance v0, Lcom/qihoo/security/ui/antivirus/list/b;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->w:Lcom/qihoo/security/app/BaseActivity$a;

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/ui/antivirus/list/b;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->al:Lcom/qihoo/security/ui/antivirus/list/b;

    .line 211
    new-instance v0, Lcom/qihoo/security/ui/antivirus/list/a;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ay:Lcom/qihoo/security/ui/antivirus/list/a$a;

    invoke-direct {v0, v1}, Lcom/qihoo/security/ui/antivirus/list/a;-><init>(Lcom/qihoo/security/ui/antivirus/list/a$a;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->V:Lcom/qihoo/security/ui/antivirus/list/a;

    .line 212
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .prologue
    .line 710
    new-instance v0, Lcom/qihoo/security/locale/widget/a;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/locale/widget/a;-><init>(Landroid/content/Context;)V

    .line 711
    const v1, 0x7f100003

    invoke-virtual {v0, v1, p1}, Lcom/qihoo/security/locale/widget/a;->inflate(ILandroid/view/Menu;)V

    .line 712
    const v0, 0x7f0b0255

    const v1, 0x7f020066

    invoke-virtual {p0, p1, v0, v1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->a(Landroid/view/Menu;II)V

    .line 713
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 1384
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->al:Lcom/qihoo/security/ui/antivirus/list/b;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/list/b;->e()V

    .line 1386
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->M:Lcom/qihoo360/mobilesafe/b/e;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/b/e;->a()V

    .line 1388
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->am:Lcom/qihoo/security/dialog/g;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/d;->b(Landroid/app/Dialog;)V

    .line 1390
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->P:Lcom/qihoo/security/malware/a/b;

    if-eqz v0, :cond_0

    .line 1391
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->P:Lcom/qihoo/security/malware/a/b;

    invoke-virtual {v0}, Lcom/qihoo/security/malware/a/b;->d()V

    .line 1394
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->x:Landroid/support/v4/content/g;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->aj:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/g;->a(Landroid/content/BroadcastReceiver;)V

    .line 1395
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ak:Lcom/qihoo/security/ui/antivirus/list/PackageReceiver;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/antivirus/list/PackageReceiver;->b(Landroid/content/Context;)V

    .line 1397
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onDestroy()V

    .line 1398
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 216
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 217
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->a(Landroid/content/Intent;Z)V

    .line 218
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .prologue
    .line 718
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 725
    :goto_0
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0

    .line 720
    :pswitch_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/16 v1, 0x12c

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    .line 718
    nop

    :pswitch_data_0
    .packed-switch 0x7f0b0255
        :pswitch_0
    .end packed-switch
.end method

.method protected onResume()V
    .locals 6

    .prologue
    const-wide/16 v4, 0x190

    const/4 v3, 0x0

    .line 738
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onResume()V

    .line 744
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a;->c(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->N:Z

    .line 746
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->N:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->am:Lcom/qihoo/security/dialog/g;

    if-nez v0, :cond_0

    .line 747
    new-instance v0, Lcom/qihoo/security/dialog/g;

    invoke-direct {v0, p0}, Lcom/qihoo/security/dialog/g;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->am:Lcom/qihoo/security/dialog/g;

    .line 748
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->am:Lcom/qihoo/security/dialog/g;

    const v1, 0x7f0c00eb

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/g;->a(I)V

    .line 749
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->am:Lcom/qihoo/security/dialog/g;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/dialog/g;->setCancelable(Z)V

    .line 750
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->am:Lcom/qihoo/security/dialog/g;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/dialog/g;->setCanceledOnTouchOutside(Z)V

    .line 753
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->W:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    .line 754
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ad:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ab:I

    if-ge v0, v1, :cond_1

    .line 755
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->W:Ljava/util/List;

    iget v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ab:I

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->aa:Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 756
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->aa:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-object v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    .line 757
    iget v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ab:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ab:I

    .line 758
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    invoke-static {v2, v0}, Lcom/qihoo360/mobilesafe/b/a;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 759
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->w:Lcom/qihoo/security/app/BaseActivity$a;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$20;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$20;-><init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)V

    invoke-virtual {v0, v1, v4, v5}, Lcom/qihoo/security/app/BaseActivity$a;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 774
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->Y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    .line 775
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->P:Lcom/qihoo/security/malware/a/b;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ac:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ab:I

    if-ge v0, v1, :cond_2

    .line 776
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->Y:Ljava/util/List;

    iget v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ab:I

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->aa:Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 777
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ab:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ab:I

    .line 778
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->aa:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-object v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/qihoo360/mobilesafe/b/i;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 779
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->w:Lcom/qihoo/security/app/BaseActivity$a;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$2;-><init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)V

    invoke-virtual {v0, v1, v4, v5}, Lcom/qihoo/security/app/BaseActivity$a;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 792
    :cond_2
    :goto_1
    return-void

    .line 765
    :cond_3
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ab:I

    if-ge v0, v1, :cond_4

    .line 766
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->W:Ljava/util/List;

    iget v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ab:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-object v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    .line 767
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 768
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->al:Lcom/qihoo/security/ui/antivirus/list/b;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/list/b;->b()V

    goto :goto_0

    .line 770
    :cond_4
    iput-boolean v3, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ad:Z

    goto :goto_0

    .line 786
    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->P:Lcom/qihoo/security/malware/a/b;

    invoke-virtual {v0}, Lcom/qihoo/security/malware/a/b;->c()V

    .line 787
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->ab:I

    if-ge v0, v1, :cond_2

    .line 788
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->al:Lcom/qihoo/security/ui/antivirus/list/b;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/list/b;->a()V

    goto :goto_1
.end method

.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 844
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/list/c;->getCount()I

    move-result v0

    if-lt p2, v0, :cond_1

    .line 889
    :cond_0
    :goto_0
    return-void

    .line 848
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/list/c;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 850
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/ui/antivirus/list/c;->a(I)Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    .line 851
    if-eqz v0, :cond_0

    .line 858
    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->e(Lcom/qihoo/security/opti/trashclear/ui/i;)Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v3

    .line 859
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->U:Lcom/qihoo/security/opti/trashclear/ui/i;

    if-eq v0, v3, :cond_2

    .line 860
    iput-object v3, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->U:Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 861
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->I:Landroid/view/View;

    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->U:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-virtual {v0, v1, v4}, Lcom/qihoo/security/ui/antivirus/list/c;->a(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 865
    :cond_2
    const/4 v0, 0x1

    move v1, v2

    :goto_1
    if-ge v0, p3, :cond_3

    .line 866
    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->E:Lcom/qihoo/security/ui/antivirus/list/c;

    add-int v5, p2, v0

    invoke-virtual {v4, v5}, Lcom/qihoo/security/ui/antivirus/list/c;->a(I)Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->e(Lcom/qihoo/security/opti/trashclear/ui/i;)Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v4

    .line 867
    if-ne v3, v4, :cond_3

    .line 865
    add-int/lit8 v1, v0, 0x1

    move v6, v1

    move v1, v0

    move v0, v6

    goto :goto_1

    .line 873
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->D:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getHeight()I

    move-result v0

    .line 874
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->D:Landroid/widget/ListView;

    invoke-virtual {v3, v1}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 875
    if-eqz v1, :cond_5

    .line 876
    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v0

    move v1, v0

    .line 878
    :goto_2
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->H:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v3

    .line 879
    if-ge v1, v3, :cond_4

    .line 880
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->H:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 881
    sub-int/2addr v1, v3

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 882
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->H:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 884
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->H:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 885
    iput v2, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 886
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->H:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    :cond_5
    move v1, v0

    goto :goto_2
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 2

    .prologue
    .line 830
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->T:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 831
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->u()V

    .line 833
    :cond_0
    iput p2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->T:I

    .line 834
    return-void
.end method

.method protected onStart()V
    .locals 1

    .prologue
    .line 730
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onStart()V

    .line 731
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->P:Lcom/qihoo/security/malware/a/b;

    if-eqz v0, :cond_0

    .line 732
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->P:Lcom/qihoo/security/malware/a/b;

    invoke-virtual {v0}, Lcom/qihoo/security/malware/a/b;->a()V

    .line 734
    :cond_0
    return-void
.end method

.method protected onStop()V
    .locals 1

    .prologue
    .line 796
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onStop()V

    .line 797
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->P:Lcom/qihoo/security/malware/a/b;

    if-eqz v0, :cond_0

    .line 798
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->P:Lcom/qihoo/security/malware/a/b;

    invoke-virtual {v0}, Lcom/qihoo/security/malware/a/b;->b()V

    .line 800
    :cond_0
    return-void
.end method

.method public setColor(I)V
    .locals 1

    .prologue
    .line 1328
    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->c(I)V

    .line 1329
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->z:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 1330
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->K:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-static {v0, p1}, Lcom/qihoo360/mobilesafe/b/c;->a(Landroid/view/View;I)V

    .line 1331
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->a(Landroid/graphics/drawable/Drawable;)V

    .line 1332
    return-void
.end method
