.class public final enum Lkik/android/chat/fragment/KikScopedDialogFragment$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/fragment/KikScopedDialogFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field public static final enum a:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

.field public static final enum b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

.field public static final enum c:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

.field private static final synthetic d:[Lkik/android/chat/fragment/KikScopedDialogFragment$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 45
    new-instance v0, Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v1, "DialogScopeApplicationModal"

    invoke-direct {v0, v1, v2}, Lkik/android/chat/fragment/KikScopedDialogFragment$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->a:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    new-instance v0, Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v1, "DialogScopeFragmentModal"

    invoke-direct {v0, v1, v3}, Lkik/android/chat/fragment/KikScopedDialogFragment$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    new-instance v0, Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v1, "DialogScopeFragmentAttached"

    invoke-direct {v0, v1, v4}, Lkik/android/chat/fragment/KikScopedDialogFragment$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->c:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    .line 44
    const/4 v0, 0x3

    new-array v0, v0, [Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    sget-object v1, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->a:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    aput-object v1, v0, v2

    sget-object v1, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    aput-object v1, v0, v3

    sget-object v1, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->c:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    aput-object v1, v0, v4

    sput-object v0, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->d:[Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lkik/android/chat/fragment/KikScopedDialogFragment$a;
    .locals 1

    .prologue
    .line 44
    const-class v0, Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    return-object v0
.end method

.method public static values()[Lkik/android/chat/fragment/KikScopedDialogFragment$a;
    .locals 1

    .prologue
    .line 44
    sget-object v0, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->d:[Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    invoke-virtual {v0}, [Lkik/android/chat/fragment/KikScopedDialogFragment$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    return-object v0
.end method
