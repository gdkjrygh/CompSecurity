.class public final Lkik/android/chat/fragment/KikCodeFragment$a;
.super Lcom/kik/ui/fragment/FragmentBase$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/fragment/KikCodeFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 789
    invoke-direct {p0}, Lcom/kik/ui/fragment/FragmentBase$a;-><init>()V

    .line 791
    const-string v0, "kik.code.group.jid"

    iput-object v0, p0, Lkik/android/chat/fragment/KikCodeFragment$a;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 811
    const-string v0, "kik.code.group.jid"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikCodeFragment$a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;)Lkik/android/chat/fragment/KikCodeFragment$a;
    .locals 1

    .prologue
    .line 803
    if-eqz p1, :cond_0

    .line 804
    const-string v0, "kik.code.group.jid"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/KikCodeFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 806
    :cond_0
    return-object p0
.end method
