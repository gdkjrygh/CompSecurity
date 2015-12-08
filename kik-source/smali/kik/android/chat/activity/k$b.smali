.class public final Lkik/android/chat/activity/k$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/activity/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/activity/k$b$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/os/Bundle;

.field private c:I

.field private d:Z

.field private e:I

.field private f:I


# direct methods
.method protected constructor <init>(Landroid/os/Bundle;Landroid/content/Context;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 441
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 437
    iput v0, p0, Lkik/android/chat/activity/k$b;->e:I

    .line 438
    iput v0, p0, Lkik/android/chat/activity/k$b;->f:I

    .line 442
    iput-object p2, p0, Lkik/android/chat/activity/k$b;->a:Landroid/content/Context;

    .line 443
    iput-object p1, p0, Lkik/android/chat/activity/k$b;->b:Landroid/os/Bundle;

    .line 444
    return-void
.end method

.method private a(Z)Landroid/content/Intent;
    .locals 5

    .prologue
    const/4 v4, -0x1

    .line 504
    iget-object v0, p0, Lkik/android/chat/activity/k$b;->b:Landroid/os/Bundle;

    const-string v1, "kik.android.util.FragmentBundle.FragmentClass"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 505
    if-nez v0, :cond_0

    .line 507
    invoke-static {}, Lcom/a/a/a;->d()Lcom/a/a/a;

    move-result-object v1

    iget-object v1, v1, Lcom/a/a/a;->c:Lcom/a/a/c/g;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Null target for class : "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lkik/android/chat/activity/k$b;->b:Landroid/os/Bundle;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/a/a/c/g;->a(Ljava/lang/String;)V

    .line 510
    :cond_0
    const-class v1, Lkik/android/chat/fragment/KikConversationsFragment;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 515
    const-class v0, Lkik/android/chat/activity/ConversationsActivity;

    .line 527
    :goto_0
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lkik/android/chat/activity/k$b;->a:Landroid/content/Context;

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 530
    iget v2, p0, Lkik/android/chat/activity/k$b;->c:I

    sget v3, Lkik/android/chat/activity/k$b$a;->b:I

    if-ne v2, v3, :cond_a

    .line 531
    if-eqz p1, :cond_8

    .line 533
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkik/android/chat/activity/k;->g()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lkik/android/chat/activity/k;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 534
    const/high16 v0, 0x4000000

    invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 558
    :goto_1
    iget-boolean v0, p0, Lkik/android/chat/activity/k$b;->d:Z

    if-eqz v0, :cond_1

    .line 559
    const-string v0, "com.kik.util.KActivityLauncher.no.refresh"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 565
    :cond_1
    :goto_2
    iget v0, p0, Lkik/android/chat/activity/k$b;->f:I

    if-eq v0, v4, :cond_2

    const-string v0, "ActivityLaunchDescriptor.anim.override.exit"

    iget v2, p0, Lkik/android/chat/activity/k$b;->f:I

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    :cond_2
    iget v0, p0, Lkik/android/chat/activity/k$b;->e:I

    if-eq v0, v4, :cond_3

    const-string v0, "ActivityLaunchDescriptor.anim.override.enter"

    iget v2, p0, Lkik/android/chat/activity/k$b;->e:I

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 569
    :cond_3
    iget-object v0, p0, Lkik/android/chat/activity/k$b;->b:Landroid/os/Bundle;

    const-string v2, "com.kik.util.KActivityLauncher.synthTaskId"

    invoke-static {}, Lkik/android/chat/activity/k;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 570
    iget-object v0, p0, Lkik/android/chat/activity/k$b;->b:Landroid/os/Bundle;

    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 571
    return-object v1

    .line 517
    :cond_4
    const-class v1, Lkik/android/chat/fragment/MissedConversationsFragment;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 518
    const-class v0, Lkik/android/chat/activity/MissedConversationsActivity;

    goto :goto_0

    .line 520
    :cond_5
    const-class v1, Lkik/android/chat/fragment/KikChatFragment;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 521
    const-class v0, Lkik/android/chat/activity/ChatActivity;

    goto :goto_0

    .line 524
    :cond_6
    const-class v0, Lkik/android/chat/activity/FragmentWrapperActivity;

    goto :goto_0

    .line 538
    :cond_7
    const-string v0, "ActivityLaunchDescriptor.anim.override.enter"

    iget-object v2, p0, Lkik/android/chat/activity/k$b;->a:Landroid/content/Context;

    const v3, 0x10100bb

    invoke-static {v2, v3}, Lkik/android/util/av;->a(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 539
    const-string v0, "ActivityLaunchDescriptor.anim.override.exit"

    iget-object v2, p0, Lkik/android/chat/activity/k$b;->a:Landroid/content/Context;

    const v3, 0x10100ba

    invoke-static {v2, v3}, Lkik/android/util/av;->a(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 541
    invoke-static {}, Lkik/android/chat/activity/k;->h()V

    .line 543
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/android/chat/activity/k;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 547
    :cond_8
    invoke-static {}, Lkik/android/util/DeviceUtils;->c()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 548
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "You are attempting to use UP on an ActivityLaunchDescriptor that is not being immediately started by KActivityLauncher.This behavior is undefined and unsupported because the returned intent could be used for a later launch.If you want UP, please use startForResult. Otherwise you may be looking for treatAsRoot() which is the behavior this will fall back to on non-debug builds"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 555
    :cond_9
    invoke-static {v1}, Lkik/android/chat/activity/k$b;->a(Landroid/content/Intent;)V

    goto/16 :goto_1

    .line 562
    :cond_a
    iget v0, p0, Lkik/android/chat/activity/k$b;->c:I

    sget v2, Lkik/android/chat/activity/k$b$a;->c:I

    if-ne v0, v2, :cond_1

    .line 563
    invoke-static {v1}, Lkik/android/chat/activity/k$b;->a(Landroid/content/Intent;)V

    goto/16 :goto_2
.end method

.method private static a(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 589
    const-string v0, "com.kik.util.KActivityLauncher.synthTaskId.treatAsRoot"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 593
    return-void
.end method


# virtual methods
.method public final a()Lkik/android/chat/activity/k$b;
    .locals 1

    .prologue
    .line 448
    sget v0, Lkik/android/chat/activity/k$b$a;->b:I

    iput v0, p0, Lkik/android/chat/activity/k$b;->c:I

    .line 449
    return-object p0
.end method

.method public final b()Lkik/android/chat/activity/k$b;
    .locals 1

    .prologue
    .line 461
    const v0, 0x7f040007

    iput v0, p0, Lkik/android/chat/activity/k$b;->e:I

    .line 462
    const v0, 0x7f040012

    iput v0, p0, Lkik/android/chat/activity/k$b;->f:I

    .line 463
    return-object p0
.end method

.method public final c()Lkik/android/chat/activity/k$b;
    .locals 1

    .prologue
    .line 475
    sget v0, Lkik/android/chat/activity/k$b$a;->c:I

    iput v0, p0, Lkik/android/chat/activity/k$b;->c:I

    .line 476
    return-object p0
.end method

.method public final d()Lkik/android/chat/activity/k$b;
    .locals 1

    .prologue
    .line 488
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/activity/k$b;->d:Z

    .line 489
    return-object p0
.end method

.method public final e()Landroid/content/Intent;
    .locals 1

    .prologue
    .line 494
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkik/android/chat/activity/k$b;->a(Z)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/kik/g/p;
    .locals 5

    .prologue
    const/4 v4, -0x1

    .line 597
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkik/android/chat/activity/k$b;->a(Z)Landroid/content/Intent;

    move-result-object v0

    .line 598
    iget-object v1, p0, Lkik/android/chat/activity/k$b;->a:Landroid/content/Context;

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Landroid/content/Intent;Landroid/content/Context;)Lcom/kik/g/p;

    move-result-object v1

    .line 599
    iget-object v2, p0, Lkik/android/chat/activity/k$b;->a:Landroid/content/Context;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lkik/android/chat/activity/k$b;->a:Landroid/content/Context;

    instance-of v2, v2, Landroid/app/Activity;

    if-nez v2, :cond_1

    invoke-static {}, Lkik/android/util/DeviceUtils;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lkik/android/chat/activity/k;->i()Lorg/c/b;

    .line 600
    :cond_0
    :goto_0
    return-object v1

    .line 599
    :cond_1
    const-string v2, "ActivityLaunchDescriptor.anim.override.enter"

    invoke-virtual {v0, v2, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    const-string v3, "ActivityLaunchDescriptor.anim.override.exit"

    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    if-eq v2, v4, :cond_0

    if-eq v3, v4, :cond_0

    iget-object v0, p0, Lkik/android/chat/activity/k$b;->a:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0, v2, v3}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto :goto_0
.end method
