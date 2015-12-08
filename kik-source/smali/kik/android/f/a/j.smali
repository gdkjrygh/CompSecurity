.class final Lkik/android/f/a/j;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/f/a/i;


# direct methods
.method constructor <init>(Lkik/android/f/a/i;)V
    .locals 0

    .prologue
    .line 1328
    iput-object p1, p0, Lkik/android/f/a/j;->a:Lkik/android/f/a/i;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 1332
    iget-object v0, p0, Lkik/android/f/a/j;->a:Lkik/android/f/a/i;

    iget-object v0, v0, Lkik/android/f/a/i;->b:Lkik/android/chat/fragment/KikCardBrowserFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikCardBrowserFragment;->Q()V

    .line 1333
    return-void
.end method
