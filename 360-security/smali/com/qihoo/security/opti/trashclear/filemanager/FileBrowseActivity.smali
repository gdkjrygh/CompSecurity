.class public Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/qihoo/security/opti/trashclear/filemanager/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$b;,
        Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;,
        Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;
    }
.end annotation


# static fields
.field public static y:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

.field private static final z:Ljava/lang/String;


# instance fields
.field private A:Landroid/widget/ListView;

.field private B:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;

.field private C:Lcom/qihoo/security/opti/trashclear/filemanager/a;

.field private D:Lcom/qihoo/security/opti/trashclear/filemanager/b;

.field private final E:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/opti/trashclear/filemanager/d;",
            ">;"
        }
    .end annotation
.end field

.field private F:J

.field private G:J

.field private H:Z

.field private I:Z

.field private J:Z

.field private final K:Landroid/os/Handler;

.field private final L:Landroid/content/BroadcastReceiver;

.field private final M:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<",
            "Lcom/qihoo/security/opti/trashclear/filemanager/d;",
            ">;"
        }
    .end annotation
.end field

.field private final N:J

.field private final O:J

.field private P:Landroid/content/Context;

.field private Q:Landroid/widget/Button;

.field private R:Landroid/widget/LinearLayout;

.field private S:Lcom/qihoo/security/dialog/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 47
    const-class v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->z:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    .line 46
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    .line 84
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->E:Ljava/util/ArrayList;

    .line 86
    iput-wide v2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->F:J

    .line 88
    iput-wide v2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->G:J

    .line 90
    iput-boolean v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->H:Z

    .line 92
    iput-boolean v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->I:Z

    .line 94
    iput-boolean v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->J:Z

    .line 113
    new-instance v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;-><init>(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->K:Landroid/os/Handler;

    .line 165
    new-instance v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$2;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$2;-><init>(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->L:Landroid/content/BroadcastReceiver;

    .line 645
    new-instance v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$4;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$4;-><init>(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->M:Ljava/util/Comparator;

    .line 656
    iput-wide v2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->N:J

    .line 658
    iput-wide v2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->O:J

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->R:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;Z)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->c(Z)V

    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->s()V

    return-void
.end method

.method static synthetic c(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->E:Ljava/util/ArrayList;

    return-object v0
.end method

.method private c(Z)V
    .locals 2

    .prologue
    .line 379
    const v0, 0x7f0b01ac

    invoke-static {p0, v0}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v1

    .line 380
    if-eqz v1, :cond_0

    .line 381
    if-eqz p1, :cond_1

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 383
    :cond_0
    return-void

    .line 381
    :cond_1
    const/16 v0, 0x8

    goto :goto_0
.end method

.method static synthetic d(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Ljava/util/Comparator;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->M:Ljava/util/Comparator;

    return-object v0
.end method

.method static synthetic e(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->B:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;

    return-object v0
.end method

.method private e(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v4, 0x1

    .line 248
    .line 252
    const-string/jumbo v0, ""

    .line 253
    const-string/jumbo v1, "[[["

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string/jumbo v1, "]]]"

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 254
    const-string/jumbo v1, "\\[\\[\\[(\\d)\\]\\]\\]"

    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    .line 255
    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 256
    :goto_0
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 257
    invoke-virtual {v1, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 259
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "[[["

    const-string/jumbo v3, ""

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "]]]"

    const-string/jumbo v3, ""

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 260
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    .line 261
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->o:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c005f

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 269
    :cond_1
    return-object p1
.end method

.method static synthetic f(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Landroid/widget/ListView;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->A:Landroid/widget/ListView;

    return-object v0
.end method

.method static synthetic g(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Lcom/qihoo/security/dialog/g;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->S:Lcom/qihoo/security/dialog/g;

    return-object v0
.end method

.method static synthetic h(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Lcom/qihoo/security/opti/trashclear/filemanager/a;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->C:Lcom/qihoo/security/opti/trashclear/filemanager/a;

    return-object v0
.end method

.method static synthetic i(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Z
    .locals 1

    .prologue
    .line 46
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->J:Z

    return v0
.end method

.method static synthetic j(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->K:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic k(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Z
    .locals 1

    .prologue
    .line 46
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->H:Z

    return v0
.end method

.method static synthetic l(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)J
    .locals 2

    .prologue
    .line 46
    iget-wide v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->G:J

    return-wide v0
.end method

.method static synthetic m(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)J
    .locals 2

    .prologue
    .line 46
    iget-wide v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->F:J

    return-wide v0
.end method

.method static synthetic n(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Z
    .locals 1

    .prologue
    .line 46
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->I:Z

    return v0
.end method

.method static synthetic o(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->P:Landroid/content/Context;

    return-object v0
.end method

.method private r()V
    .locals 4

    .prologue
    .line 97
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->y:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->y:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    iget-object v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    if-nez v0, :cond_1

    .line 111
    :cond_0
    :goto_0
    return-void

    .line 101
    :cond_1
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->y:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    iget-object v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v1, "dateNum"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 102
    sget-object v1, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->y:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    iget-object v1, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v2, "isInDate"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    .line 105
    if-lez v0, :cond_0

    .line 106
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->H:Z

    .line 107
    iput-boolean v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->I:Z

    .line 108
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->G:J

    .line 109
    const-wide/32 v2, 0x5265c00

    int-to-long v0, v0

    mul-long/2addr v0, v2

    iput-wide v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->F:J

    goto :goto_0
.end method

.method private s()V
    .locals 5

    .prologue
    const/16 v1, 0x8

    const/4 v2, 0x0

    .line 367
    invoke-static {}, Lcom/qihoo/security/opti/trashclear/filemanager/e;->a()Z

    move-result v3

    .line 368
    const v0, 0x7f0b0204

    invoke-static {p0, v0}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v4

    .line 369
    if-eqz v3, :cond_1

    move v0, v1

    :goto_0
    invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V

    .line 371
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->A:Landroid/widget/ListView;

    if-eqz v3, :cond_2

    :goto_1
    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setVisibility(I)V

    .line 373
    if-eqz v3, :cond_0

    .line 374
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->C:Lcom/qihoo/security/opti/trashclear/filemanager/a;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->c()V

    .line 376
    :cond_0
    return-void

    :cond_1
    move v0, v2

    .line 369
    goto :goto_0

    :cond_2
    move v2, v1

    .line 371
    goto :goto_1
.end method

.method private t()V
    .locals 3

    .prologue
    .line 676
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->u()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 677
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->S:Lcom/qihoo/security/dialog/g;

    if-nez v0, :cond_0

    .line 678
    new-instance v0, Lcom/qihoo/security/dialog/g;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->P:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/dialog/g;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->S:Lcom/qihoo/security/dialog/g;

    .line 680
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->S:Lcom/qihoo/security/dialog/g;

    invoke-virtual {v0}, Lcom/qihoo/security/dialog/g;->show()V

    .line 682
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 683
    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$5;

    invoke-direct {v2, p0, v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$5;-><init>(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;Ljava/util/ArrayList;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 725
    :goto_0
    return-void

    .line 722
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->P:Landroid/content/Context;

    const v1, 0x7f0c0078

    const/16 v2, 0x7d0

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/content/Context;II)V

    goto :goto_0
.end method

.method private u()Z
    .locals 2

    .prologue
    .line 728
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;

    .line 729
    iget-boolean v0, v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;->g:Z

    if-eqz v0, :cond_0

    .line 730
    const/4 v0, 0x1

    .line 733
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/util/Comparator;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator",
            "<",
            "Lcom/qihoo/security/opti/trashclear/filemanager/d;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 464
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->E:Ljava/util/ArrayList;

    invoke-static {v0, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 465
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->q()V

    .line 466
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 289
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$3;

    invoke-direct {v1, p0, p1}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$3;-><init>(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 364
    return-void
.end method

.method public d(I)Landroid/view/View;
    .locals 1

    .prologue
    .line 387
    invoke-static {p0, p1}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 441
    const/4 v0, 0x0

    return v0
.end method

.method public e(I)Lcom/qihoo/security/opti/trashclear/filemanager/d;
    .locals 1

    .prologue
    .line 455
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_1

    .line 456
    :cond_0
    const/4 v0, 0x0

    .line 459
    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->E:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;

    goto :goto_0
.end method

.method public o()Z
    .locals 1

    .prologue
    .line 284
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->C:Lcom/qihoo/security/opti/trashclear/filemanager/a;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->e()Z

    move-result v0

    return v0
.end method

.method public onBackPressed()V
    .locals 0

    .prologue
    .line 274
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->o()Z

    .line 275
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 670
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0b0206

    if-ne v0, v1, :cond_0

    .line 671
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->t()V

    .line 673
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 8

    .prologue
    .line 181
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 182
    const v0, 0x7f030099

    invoke-static {p0, v0}, Lcom/qihoo360/mobilesafe/b/s;->b(Landroid/app/Activity;I)V

    .line 184
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->r()V

    .line 186
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->getIntent()Landroid/content/Intent;

    .line 187
    iput-object p0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->P:Landroid/content/Context;

    .line 188
    new-instance v0, Lcom/qihoo/security/opti/trashclear/filemanager/a;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/filemanager/a;-><init>(Lcom/qihoo/security/opti/trashclear/filemanager/f;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->C:Lcom/qihoo/security/opti/trashclear/filemanager/a;

    .line 189
    new-instance v0, Lcom/qihoo/security/opti/trashclear/filemanager/b;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/filemanager/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->D:Lcom/qihoo/security/opti/trashclear/filemanager/b;

    .line 190
    const v0, 0x7f0b0203

    invoke-static {p0, v0}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->A:Landroid/widget/ListView;

    .line 191
    new-instance v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->E:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->C:Lcom/qihoo/security/opti/trashclear/filemanager/a;

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->D:Lcom/qihoo/security/opti/trashclear/filemanager/b;

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;-><init>(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;Ljava/util/ArrayList;Lcom/qihoo/security/opti/trashclear/filemanager/a;Lcom/qihoo/security/opti/trashclear/filemanager/b;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->B:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;

    .line 193
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v0

    const-string/jumbo v1, "current_directory_name"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 194
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v0

    const-string/jumbo v2, "current_directory"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 195
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v2

    const-string/jumbo v3, "current_sdcard_directory"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 196
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v2

    const-string/jumbo v4, "current_filter_directory"

    invoke-virtual {v2, v4}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 197
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v2

    const-string/jumbo v5, "current_prefix_directory"

    invoke-virtual {v2, v5}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 199
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v2

    const-string/jumbo v6, "source_mediastore_disk"

    const/4 v7, 0x0

    invoke-virtual {v2, v6, v7}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->J:Z

    .line 201
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 202
    :cond_0
    const-string/jumbo v1, "storage"

    .line 203
    const-string/jumbo v0, "/storage"

    .line 205
    :cond_1
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 206
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 207
    iget-object v6, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->C:Lcom/qihoo/security/opti/trashclear/filemanager/a;

    invoke-virtual {v6, v0}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->c(Ljava/lang/String;)V

    .line 208
    invoke-virtual {v2}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    .line 211
    :goto_0
    const v0, 0x7f0b0206

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->Q:Landroid/widget/Button;

    .line 212
    const v0, 0x7f0b0205

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->R:Landroid/widget/LinearLayout;

    .line 213
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->Q:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 214
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->J:Z

    if-eqz v0, :cond_2

    .line 215
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->Q:Landroid/widget/Button;

    const v6, 0x7f02012a

    invoke-virtual {v0, v6}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 216
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->Q:Landroid/widget/Button;

    const/4 v6, -0x1

    invoke-virtual {v0, v6}, Landroid/widget/Button;->setTextColor(I)V

    .line 217
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->Q:Landroid/widget/Button;

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v6

    const v7, 0x7f0c0079

    invoke-virtual {v6, v7}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 221
    :cond_2
    invoke-direct {p0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->b(Ljava/lang/String;)V

    .line 222
    new-instance v0, Lcom/qihoo/security/dialog/g;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->P:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/dialog/g;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->S:Lcom/qihoo/security/dialog/g;

    .line 224
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->C:Lcom/qihoo/security/opti/trashclear/filemanager/a;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->a(Ljava/lang/String;)V

    .line 225
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->C:Lcom/qihoo/security/opti/trashclear/filemanager/a;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->b(Ljava/lang/String;)V

    .line 226
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->C:Lcom/qihoo/security/opti/trashclear/filemanager/a;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->d(Ljava/lang/String;)V

    .line 227
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->C:Lcom/qihoo/security/opti/trashclear/filemanager/a;

    invoke-virtual {v0, v4}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->a([Ljava/lang/String;)V

    .line 228
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->C:Lcom/qihoo/security/opti/trashclear/filemanager/a;

    invoke-virtual {v0, v5}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->b([Ljava/lang/String;)V

    .line 230
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->A:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->B:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 232
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 233
    const-string/jumbo v1, "android.intent.action.MEDIA_MOUNTED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 234
    const-string/jumbo v1, "android.intent.action.MEDIA_UNMOUNTED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 235
    const-string/jumbo v1, "file"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 236
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->L:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v1, v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 238
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->s()V

    .line 239
    return-void

    :cond_3
    move-object v2, v0

    goto/16 :goto_0
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 279
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onDestroy()V

    .line 280
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->L:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 281
    return-void
.end method

.method public p()Landroid/content/Context;
    .locals 0

    .prologue
    .line 392
    return-object p0
.end method

.method public q()V
    .locals 2

    .prologue
    .line 397
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->K:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 405
    return-void
.end method
