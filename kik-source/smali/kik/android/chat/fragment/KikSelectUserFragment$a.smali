.class public final Lkik/android/chat/fragment/KikSelectUserFragment$a;
.super Lkik/android/chat/fragment/KikContactsListFragment$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/fragment/KikSelectUserFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 194
    invoke-direct {p0}, Lkik/android/chat/fragment/KikContactsListFragment$a;-><init>()V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikSelectUserFragment$a;)Z
    .locals 1

    .prologue
    .line 194
    const-string v0, "showSelectAsSendTo"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikSelectUserFragment$a;->f(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final a()Lkik/android/chat/fragment/KikSelectUserFragment$a;
    .locals 2

    .prologue
    .line 200
    const-string v0, "showSelectAsSendTo"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikSelectUserFragment$a;->a(Ljava/lang/String;Z)V

    .line 201
    return-object p0
.end method
