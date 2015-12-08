.class final Lkik/android/widget/dy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/TalkToCoverView;


# direct methods
.method constructor <init>(Lkik/android/widget/TalkToCoverView;)V
    .locals 0

    .prologue
    .line 124
    iput-object p1, p0, Lkik/android/widget/dy;->a:Lkik/android/widget/TalkToCoverView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 129
    packed-switch p2, :pswitch_data_0

    .line 140
    :goto_0
    return-void

    .line 131
    :pswitch_0
    iget-object v0, p0, Lkik/android/widget/dy;->a:Lkik/android/widget/TalkToCoverView;

    invoke-static {v0}, Lkik/android/widget/TalkToCoverView;->b(Lkik/android/widget/TalkToCoverView;)V

    goto :goto_0

    .line 134
    :pswitch_1
    iget-object v0, p0, Lkik/android/widget/dy;->a:Lkik/android/widget/TalkToCoverView;

    invoke-static {v0}, Lkik/android/widget/TalkToCoverView;->c(Lkik/android/widget/TalkToCoverView;)V

    goto :goto_0

    .line 137
    :pswitch_2
    iget-object v0, p0, Lkik/android/widget/dy;->a:Lkik/android/widget/TalkToCoverView;

    invoke-static {v0}, Lkik/android/widget/TalkToCoverView;->d(Lkik/android/widget/TalkToCoverView;)V

    goto :goto_0

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
