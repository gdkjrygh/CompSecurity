.class public final Lkik/android/chat/fragment/KikAddContactFragment$b;
.super Lcom/kik/ui/fragment/FragmentBase$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/fragment/KikAddContactFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 298
    invoke-direct {p0}, Lcom/kik/ui/fragment/FragmentBase$a;-><init>()V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikAddContactFragment$b;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 298
    const-string v0, "NameSuggestion"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikAddContactFragment$b;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikAddContactFragment$b;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 298
    const-string v0, "FilteredNames"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikAddContactFragment$b;->k(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic c(Lkik/android/chat/fragment/KikAddContactFragment$b;)I
    .locals 2

    .prologue
    .line 298
    const-string v0, "ActionType"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikAddContactFragment$b;->b(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method static synthetic d(Lkik/android/chat/fragment/KikAddContactFragment$b;)Z
    .locals 1

    .prologue
    .line 298
    const-string v0, "showKeyboard"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikAddContactFragment$b;->f(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final a()Lkik/android/chat/fragment/KikAddContactFragment$b;
    .locals 2

    .prologue
    .line 307
    const-string v0, "showKeyboard"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikAddContactFragment$b;->a(Ljava/lang/String;Z)V

    .line 308
    return-object p0
.end method

.method public final a(Ljava/lang/String;)Lkik/android/chat/fragment/KikAddContactFragment$b;
    .locals 1

    .prologue
    .line 318
    const-string v0, "NameSuggestion"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/KikAddContactFragment$b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 319
    return-object p0
.end method

.method public final a(Ljava/util/ArrayList;)Lkik/android/chat/fragment/KikAddContactFragment$b;
    .locals 1

    .prologue
    .line 329
    const-string v0, "FilteredNames"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/KikAddContactFragment$b;->a(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 330
    return-object p0
.end method

.method public final b(I)Lkik/android/chat/fragment/KikAddContactFragment$b;
    .locals 1

    .prologue
    .line 340
    const-string v0, "ActionType"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/KikAddContactFragment$b;->a(Ljava/lang/String;I)V

    .line 341
    return-object p0
.end method
