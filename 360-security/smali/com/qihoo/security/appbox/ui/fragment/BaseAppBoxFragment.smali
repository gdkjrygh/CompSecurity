.class public Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;
.super Landroid/support/v4/app/ListFragment;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/AbsListView$OnScrollListener;
.implements Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver$a;


# instance fields
.field protected i:Lcom/qihoo/security/appbox/ui/view/a;

.field protected j:Landroid/widget/ListView;

.field protected k:Landroid/view/View;

.field protected l:Landroid/view/View;

.field protected m:Lcom/qihoo/security/appbox/ui/view/FooterLoadingView;

.field protected final n:Ljava/util/concurrent/atomic/AtomicBoolean;

.field protected final o:Ljava/util/concurrent/atomic/AtomicBoolean;

.field protected final p:Ljava/util/concurrent/atomic/AtomicBoolean;

.field protected final q:Ljava/util/concurrent/atomic/AtomicBoolean;

.field protected r:Landroid/content/Context;

.field protected s:Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver;

.field protected t:Ljava/lang/String;

.field protected u:I

.field protected v:J

.field protected w:Landroid/os/Handler;

.field protected x:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 48
    invoke-direct {p0}, Landroid/support/v4/app/ListFragment;-><init>()V

    .line 59
    iput-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->k:Landroid/view/View;

    .line 60
    iput-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->l:Landroid/view/View;

    .line 64
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 66
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 68
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 70
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 77
    iput v1, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->u:I

    .line 79
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->w:Landroid/os/Handler;

    return-void
.end method

.method private a(Ljava/lang/String;Z)V
    .locals 4

    .prologue
    .line 281
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->i:Lcom/qihoo/security/appbox/ui/view/a;

    if-eqz v0, :cond_2

    .line 282
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->i:Lcom/qihoo/security/appbox/ui/view/a;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/view/a;->a()Ljava/util/List;

    move-result-object v1

    .line 283
    if-eqz v1, :cond_2

    .line 284
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/appbox/core/c;

    .line 285
    iget-object v3, v0, Lcom/qihoo/security/appbox/core/c;->k:Ljava/lang/String;

    if-eqz v3, :cond_0

    iget-object v3, v0, Lcom/qihoo/security/appbox/core/c;->k:Ljava/lang/String;

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 286
    iput-boolean p2, v0, Lcom/qihoo/security/appbox/core/c;->c:Z

    goto :goto_0

    .line 289
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->i:Lcom/qihoo/security/appbox/ui/view/a;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/appbox/ui/view/a;->a(Ljava/util/List;)V

    .line 292
    :cond_2
    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 209
    iput-object p1, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->t:Ljava/lang/String;

    .line 210
    return-void
.end method

.method protected b()V
    .locals 4

    .prologue
    .line 153
    invoke-static {}, Lcom/qihoo/security/appbox/a/a;->a()Ljava/lang/String;

    move-result-object v0

    .line 154
    iget-object v1, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->r:Landroid/content/Context;

    const-string/jumbo v2, "appbox_last_time_use_language"

    const-string/jumbo v3, ""

    invoke-static {v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 158
    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 159
    invoke-static {}, Lcom/qihoo/security/appbox/core/a;->a()Lcom/qihoo/security/appbox/core/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/core/a;->f()V

    .line 161
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 272
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->a(Ljava/lang/String;Z)V

    .line 273
    return-void
.end method

.method protected c()V
    .locals 0

    .prologue
    .line 165
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 277
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->a(Ljava/lang/String;Z)V

    .line 278
    return-void
.end method

.method protected d()V
    .locals 2

    .prologue
    .line 135
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->r:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/locale/language/b;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 136
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->r:Landroid/content/Context;

    const-string/jumbo v1, "com.facebook.katana"

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/b/o;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->r:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/o;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/qihoo/security/appbox/core/a;->a()Lcom/qihoo/security/appbox/core/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/core/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xa

    if-le v0, v1, :cond_0

    .line 138
    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->e()V

    .line 142
    :goto_0
    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->b()V

    .line 146
    :goto_1
    return-void

    .line 140
    :cond_0
    invoke-static {}, Lcom/qihoo/security/appbox/core/a;->a()Lcom/qihoo/security/appbox/core/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/core/a;->e()V

    goto :goto_0

    .line 144
    :cond_1
    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->f()V

    goto :goto_1
.end method

.method protected e()V
    .locals 0

    .prologue
    .line 150
    return-void
.end method

.method protected f()V
    .locals 2

    .prologue
    .line 187
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->r:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/locale/language/b;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 188
    const/16 v0, 0x659b

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 190
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->k:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 191
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->i:Lcom/qihoo/security/appbox/ui/view/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/appbox/ui/view/a;->a(Ljava/util/List;)V

    .line 192
    return-void
.end method

.method public g()V
    .locals 1

    .prologue
    .line 265
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->i:Lcom/qihoo/security/appbox/ui/view/a;

    if-eqz v0, :cond_0

    .line 266
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->i:Lcom/qihoo/security/appbox/ui/view/a;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/view/a;->notifyDataSetChanged()V

    .line 268
    :cond_0
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 111
    invoke-super {p0, p1}, Landroid/support/v4/app/ListFragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 117
    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->r:Landroid/content/Context;

    .line 119
    new-instance v0, Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver;

    invoke-direct {v0, p0}, Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver;-><init>(Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver$a;)V

    iput-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->s:Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver;

    .line 120
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->s:Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver;

    iget-object v1, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->r:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver;->a(Landroid/content/Context;)V

    .line 122
    new-instance v0, Lcom/qihoo/security/appbox/ui/view/a;

    iget-object v1, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->r:Landroid/content/Context;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->t:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, Lcom/qihoo/security/appbox/ui/view/a;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->i:Lcom/qihoo/security/appbox/ui/view/a;

    .line 123
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->j:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->i:Lcom/qihoo/security/appbox/ui/view/a;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 124
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->w:Landroid/os/Handler;

    new-instance v1, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment$1;-><init>(Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;)V

    iget-wide v2, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->x:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 132
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 169
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 184
    :goto_0
    return-void

    .line 171
    :sswitch_0
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->r:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/locale/language/b;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 172
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->r:Landroid/content/Context;

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v1

    const v2, 0x7f0c01c0

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 175
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->b()V

    goto :goto_0

    .line 179
    :sswitch_1
    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->b()V

    goto :goto_0

    .line 169
    :sswitch_data_0
    .sparse-switch
        0x7f0b0093 -> :sswitch_0
        0x7f0b0121 -> :sswitch_1
    .end sparse-switch
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .prologue
    .line 84
    const v0, 0x7f030023

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 86
    const v1, 0x7f0b009b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->k:Landroid/view/View;

    .line 87
    iget-object v1, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->k:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 89
    const v1, 0x7f0b0093

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->l:Landroid/view/View;

    .line 90
    iget-object v1, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->l:Landroid/view/View;

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 92
    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 196
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->s:Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver;

    if-eqz v0, :cond_0

    .line 197
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->r:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->s:Lcom/qihoo/security/appbox/ui/receiver/AppBoxReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 199
    :cond_0
    invoke-static {}, Lcom/qihoo/security/appbox/c/a/b;->a()Lcom/qihoo/security/appbox/c/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/c/a/b;->b()V

    .line 200
    invoke-super {p0}, Landroid/support/v4/app/ListFragment;->onDestroy()V

    .line 201
    return-void
.end method

.method public onDetach()V
    .locals 1

    .prologue
    .line 296
    invoke-super {p0}, Landroid/support/v4/app/ListFragment;->onDetach()V

    .line 297
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->i:Lcom/qihoo/security/appbox/ui/view/a;

    if-eqz v0, :cond_0

    .line 298
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->i:Lcom/qihoo/security/appbox/ui/view/a;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/view/a;->c()V

    .line 301
    :cond_0
    return-void
.end method

.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 2

    .prologue
    .line 214
    const/4 v0, 0x1

    if-gt p4, v0, :cond_1

    .line 232
    :cond_0
    :goto_0
    return-void

    .line 217
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 220
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 223
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 226
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getLastVisiblePosition()I

    move-result v0

    add-int/lit8 v1, p4, -0x1

    if-ne v0, v1, :cond_0

    .line 230
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->m:Lcom/qihoo/security/appbox/ui/view/FooterLoadingView;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/view/FooterLoadingView;->b()V

    goto :goto_0
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 2

    .prologue
    .line 239
    packed-switch p2, :pswitch_data_0

    .line 261
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 241
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 244
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 247
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 250
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getLastVisiblePosition()I

    move-result v0

    invoke-virtual {p1}, Landroid/widget/AbsListView;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_0

    .line 251
    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->c()V

    goto :goto_0

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 97
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/ListFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 98
    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->a()Landroid/widget/ListView;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->j:Landroid/widget/ListView;

    .line 100
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->j:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->l:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    .line 102
    new-instance v0, Lcom/qihoo/security/appbox/ui/view/FooterLoadingView;

    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/qihoo/security/appbox/ui/view/FooterLoadingView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->m:Lcom/qihoo/security/appbox/ui/view/FooterLoadingView;

    .line 103
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->m:Lcom/qihoo/security/appbox/ui/view/FooterLoadingView;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/appbox/ui/view/FooterLoadingView;->setFooterClickListener(Landroid/view/View$OnClickListener;)V

    .line 104
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->j:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->m:Lcom/qihoo/security/appbox/ui/view/FooterLoadingView;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;)V

    .line 106
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/BaseAppBoxFragment;->j:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 107
    return-void
.end method
