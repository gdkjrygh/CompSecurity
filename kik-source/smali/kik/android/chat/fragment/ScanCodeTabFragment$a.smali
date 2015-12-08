.class public final Lkik/android/chat/fragment/ScanCodeTabFragment$a;
.super Lcom/kik/ui/fragment/FragmentBase$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/fragment/ScanCodeTabFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 565
    invoke-direct {p0}, Lcom/kik/ui/fragment/FragmentBase$a;-><init>()V

    .line 567
    const-string v0, "kik.tab.code.first"

    iput-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->a:Ljava/lang/String;

    .line 568
    const-string v0, "kik.tab.group.jid"

    iput-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->b:Ljava/lang/String;

    .line 569
    const-string v0, "kik.tab.group.set"

    iput-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->c:Ljava/lang/String;

    .line 570
    const-string v0, "kik.tab.opened.from"

    iput-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->d:Ljava/lang/String;

    .line 571
    const-string v0, "kik.tab.hidden.on.fragment.install"

    iput-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lkik/android/chat/fragment/ScanCodeTabFragment$a;
    .locals 2

    .prologue
    .line 594
    if-eqz p1, :cond_0

    .line 595
    const-string v0, "kik.tab.group.jid"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 596
    const-string v0, "kik.tab.group.set"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->a(Ljava/lang/String;Z)V

    .line 598
    :cond_0
    return-object p0
.end method

.method public final a(Lkik/android/chat/fragment/ScanCodeTabFragment$c;)Lkik/android/chat/fragment/ScanCodeTabFragment$a;
    .locals 2

    .prologue
    .line 603
    if-eqz p1, :cond_0

    .line 604
    const-string v0, "kik.tab.opened.from"

    invoke-virtual {p1}, Lkik/android/chat/fragment/ScanCodeTabFragment$c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 606
    :cond_0
    return-object p0
.end method

.method public final a(Z)Lkik/android/chat/fragment/ScanCodeTabFragment$a;
    .locals 1

    .prologue
    .line 575
    const-string v0, "kik.tab.code.first"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->a(Ljava/lang/String;Z)V

    .line 576
    return-object p0
.end method

.method public final a()Z
    .locals 2

    .prologue
    .line 581
    const-string v0, "kik.tab.code.first"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->b(Ljava/lang/String;Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 611
    const-string v0, "kik.tab.opened.from"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 616
    const-string v0, "kik.tab.group.jid"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 621
    const-string v0, "kik.tab.group.set"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->f(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final e()Z
    .locals 2

    .prologue
    .line 626
    const-string v0, "kik.tab.hidden.on.fragment.install"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->b(Ljava/lang/String;Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final f()Lkik/android/chat/fragment/ScanCodeTabFragment$a;
    .locals 2

    .prologue
    .line 637
    const-string v0, "kik.tab.hidden.on.fragment.install"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->a(Ljava/lang/String;Z)V

    .line 638
    return-object p0
.end method
