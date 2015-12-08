.class final Lkik/android/chat/fragment/oa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikPreferenceLaunchpad;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikPreferenceLaunchpad;)V
    .locals 0

    .prologue
    .line 362
    iput-object p1, p0, Lkik/android/chat/fragment/oa;->a:Lkik/android/chat/fragment/KikPreferenceLaunchpad;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 366
    iget-object v0, p0, Lkik/android/chat/fragment/oa;->a:Lkik/android/chat/fragment/KikPreferenceLaunchpad;

    invoke-static {v0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->b(Lkik/android/chat/fragment/KikPreferenceLaunchpad;)V

    .line 367
    return-void
.end method
