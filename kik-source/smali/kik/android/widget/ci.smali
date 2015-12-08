.class final Lkik/android/widget/ci;
.super Lkik/android/chat/fragment/KikDialogFragment$c;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lkik/android/chat/fragment/KikScopedDialogFragment;


# direct methods
.method constructor <init>(Landroid/content/Context;Lkik/android/chat/fragment/KikScopedDialogFragment;)V
    .locals 0

    .prologue
    .line 106
    iput-object p1, p0, Lkik/android/widget/ci;->a:Landroid/content/Context;

    iput-object p2, p0, Lkik/android/widget/ci;->b:Lkik/android/chat/fragment/KikScopedDialogFragment;

    invoke-direct {p0}, Lkik/android/chat/fragment/KikDialogFragment$c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 110
    iget-object v0, p0, Lkik/android/widget/ci;->a:Landroid/content/Context;

    iget-object v1, p0, Lkik/android/widget/ci;->b:Lkik/android/chat/fragment/KikScopedDialogFragment;

    invoke-static {v0, v1}, Lkik/android/widget/ce;->b(Landroid/content/Context;Lkik/android/chat/fragment/KikScopedDialogFragment;)V

    .line 111
    return-void
.end method
