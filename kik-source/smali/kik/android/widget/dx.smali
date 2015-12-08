.class final Lkik/android/widget/dx;
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
    .line 98
    iput-object p1, p0, Lkik/android/widget/dx;->a:Lkik/android/widget/TalkToCoverView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 103
    packed-switch p2, :pswitch_data_0

    .line 108
    :goto_0
    return-void

    .line 105
    :pswitch_0
    iget-object v0, p0, Lkik/android/widget/dx;->a:Lkik/android/widget/TalkToCoverView;

    invoke-static {v0}, Lkik/android/widget/TalkToCoverView;->a(Lkik/android/widget/TalkToCoverView;)V

    goto :goto_0

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
