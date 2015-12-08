.class public abstract Lkik/android/chat/fragment/KikIqFragmentBase;
.super Lkik/android/chat/fragment/KikScopedDialogFragment;
.source "SourceFile"

# interfaces
.implements Lkik/a/f/j;


# static fields
.field private static final c:Lorg/c/b;


# instance fields
.field protected P:Ljava/lang/String;

.field protected Q:Ljava/lang/String;

.field protected R:I

.field protected S:Lkik/a/e/f;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private a:Lkik/a/f/f/y;

.field private b:Landroid/content/res/Resources;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 39
    const-string v0, "KikIqFragmentBase"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/chat/fragment/KikIqFragmentBase;->c:Lorg/c/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;-><init>()V

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/chat/fragment/KikIqFragmentBase;->a:Lkik/a/f/f/y;

    .line 34
    const-string v0, ""

    iput-object v0, p0, Lkik/android/chat/fragment/KikIqFragmentBase;->P:Ljava/lang/String;

    .line 35
    const-string v0, ""

    iput-object v0, p0, Lkik/android/chat/fragment/KikIqFragmentBase;->Q:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected final X()V
    .locals 1

    .prologue
    .line 216
    iget-object v0, p0, Lkik/android/chat/fragment/KikIqFragmentBase;->a:Lkik/a/f/f/y;

    if-eqz v0, :cond_0

    .line 217
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/chat/fragment/KikIqFragmentBase;->a:Lkik/a/f/f/y;

    .line 219
    :cond_0
    return-void
.end method

.method protected final a(Ljava/util/concurrent/Callable;Ljava/lang/String;)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 76
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/p;

    .line 78
    new-instance v1, Lkik/android/chat/fragment/lw;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/lw;-><init>(Lkik/android/chat/fragment/KikIqFragmentBase;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 124
    const/4 v1, 0x1

    invoke-virtual {p0, p2, v1}, Lkik/android/chat/fragment/KikIqFragmentBase;->b(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 128
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Throwable;)Lcom/kik/g/p;

    move-result-object v0

    goto :goto_0
.end method

.method protected a(ILjava/lang/String;)V
    .locals 2

    .prologue
    .line 251
    iget-object v0, p0, Lkik/android/chat/fragment/KikIqFragmentBase;->P:Ljava/lang/String;

    iget-object v1, p0, Lkik/android/chat/fragment/KikIqFragmentBase;->Q:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikIqFragmentBase;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    return-void
.end method

.method protected a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 161
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>()V

    invoke-virtual {v0, p1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    invoke-virtual {v0, p2}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Z)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikIqFragmentBase;->b:Landroid/content/res/Resources;

    const v2, 0x7f090193

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    .line 162
    iget-object v0, v0, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikIqFragmentBase;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 163
    return-void
.end method

.method protected final a(Lkik/a/f/f/y;)V
    .locals 1

    .prologue
    .line 52
    iput-object p1, p0, Lkik/android/chat/fragment/KikIqFragmentBase;->a:Lkik/a/f/f/y;

    .line 57
    iget-object v0, p0, Lkik/android/chat/fragment/KikIqFragmentBase;->S:Lkik/a/e/f;

    invoke-interface {v0, p1}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    .line 59
    return-void
.end method

.method protected final a(Lkik/a/f/f/y;Ljava/lang/String;Z)V
    .locals 1

    .prologue
    .line 135
    iput-object p1, p0, Lkik/android/chat/fragment/KikIqFragmentBase;->a:Lkik/a/f/f/y;

    .line 136
    invoke-virtual {p0, p2, p3}, Lkik/android/chat/fragment/KikIqFragmentBase;->b(Ljava/lang/String;Z)V

    .line 137
    iget-object v0, p0, Lkik/android/chat/fragment/KikIqFragmentBase;->S:Lkik/a/e/f;

    invoke-interface {v0, p1}, Lkik/a/e/f;->a(Lkik/a/f/f/z;)Lcom/kik/g/p;

    .line 138
    return-void
.end method

.method protected a(Lkik/a/f/f/z;)V
    .locals 0

    .prologue
    .line 231
    return-void
.end method

.method public final a(Lkik/a/f/f/z;I)V
    .locals 2

    .prologue
    .line 169
    iget-object v0, p0, Lkik/android/chat/fragment/KikIqFragmentBase;->a:Lkik/a/f/f/y;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 170
    packed-switch p2, :pswitch_data_0

    .line 212
    :goto_0
    :pswitch_0
    return-void

    .line 178
    :pswitch_1
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 179
    if-eqz v0, :cond_0

    .line 180
    new-instance v1, Lkik/android/chat/fragment/ma;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ma;-><init>(Lkik/android/chat/fragment/KikIqFragmentBase;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 188
    :cond_0
    invoke-virtual {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->a(Lkik/a/f/f/z;)V

    .line 189
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/chat/fragment/KikIqFragmentBase;->a:Lkik/a/f/f/y;

    goto :goto_0

    .line 192
    :pswitch_2
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 193
    invoke-virtual {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->b(Lkik/a/f/f/z;)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    .line 194
    new-instance v1, Lkik/android/chat/fragment/mb;

    invoke-direct {v1, p0, p1}, Lkik/android/chat/fragment/mb;-><init>(Lkik/android/chat/fragment/KikIqFragmentBase;Lkik/a/f/f/z;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 203
    :cond_1
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->w()V

    goto :goto_0

    .line 210
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Dropping unexpected iq: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 170
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected b(Ljava/lang/String;Z)V
    .locals 2

    .prologue
    .line 142
    new-instance v0, Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-direct {v0, p1, p2}, Lkik/android/chat/fragment/ProgressDialogFragment;-><init>(Ljava/lang/String;Z)V

    .line 143
    new-instance v1, Lkik/android/chat/fragment/lz;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/lz;-><init>(Lkik/android/chat/fragment/KikIqFragmentBase;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ProgressDialogFragment;->a(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 150
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikIqFragmentBase;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 151
    return-void
.end method

.method protected b(Lkik/a/f/f/z;)Z
    .locals 1

    .prologue
    .line 246
    const/4 v0, 0x1

    return v0
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 69
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onAttach(Landroid/app/Activity;)V

    .line 70
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikIqFragmentBase;->b:Landroid/content/res/Resources;

    .line 71
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 44
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/KikIqFragmentBase;)V

    .line 45
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 46
    const v0, 0x7f0902ba

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikIqFragmentBase;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikIqFragmentBase;->P:Ljava/lang/String;

    .line 47
    const v0, 0x7f090383

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikIqFragmentBase;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikIqFragmentBase;->Q:Ljava/lang/String;

    .line 48
    return-void
.end method

.method protected w()V
    .locals 1

    .prologue
    .line 155
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikIqFragmentBase;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 156
    return-void
.end method
