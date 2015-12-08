.class public Lcom/roidapp/photogrid/common/JoinAndroidBeta;
.super Lcom/roidapp/photogrid/release/ParentActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 9
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ParentActivity;-><init>()V

    .line 13
    const-string v0, "Join the Android Beta!"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/JoinAndroidBeta;->c:Ljava/lang/String;

    .line 15
    const-string v0, "Photo Grid\'s Android beta allows you to gain early access to new builds of Photo Grid - Collage Maker before they\'re released. As a beta tester, you\'ll receive updated Photo Grid versions periodically. In turn, you\'ll be able to give us feedback and suggestions, helping us create an even better app."

    iput-object v0, p0, Lcom/roidapp/photogrid/common/JoinAndroidBeta;->d:Ljava/lang/String;

    .line 16
    const-string v0, "To sign up and install the latest beta:"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/JoinAndroidBeta;->e:Ljava/lang/String;

    .line 17
    const-string v0, "Join our Google+ community.\n(https://plus.google.com/u/0/communities/112943284561729274147 )\n(Make sure you join using the same email you use to access Google Play.)"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/JoinAndroidBeta;->f:Ljava/lang/String;

    .line 18
    const-string v0, "Go to this Google Play link, \n(https://play.google.com/apps/testing/com.roidapp.photogrid)\nthen select \"Become a Tester\" to opt into the program.\n"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/JoinAndroidBeta;->g:Ljava/lang/String;

    .line 21
    const-string v0, "Wait for at least an hour to give Google Play time to update, then uninstall and reinstall Photo Grid. This app will automatically stay updated with future beta versions just like any other Android app.\nOnce installed, spend some time with the app and let us know what you think by posting in the Photo Grid Google+ community or by contacting us at roidapp@gmail.com. Your feedback on both functionality and performance is extremely valuable, and we\'ll be listening closely and basing future updates on your ideas. The more feedback we receive, the better Photo Grid for Android will be!"

    iput-object v0, p0, Lcom/roidapp/photogrid/common/JoinAndroidBeta;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 26
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 28
    const v0, 0x7f0300d9

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/common/JoinAndroidBeta;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    :goto_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/common/JoinAndroidBeta;->v:Z

    if-nez v0, :cond_0

    .line 35
    const v0, 0x7f0d0390

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/common/JoinAndroidBeta;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/common/JoinAndroidBeta;->b:Landroid/widget/TextView;

    .line 36
    iget-object v0, p0, Lcom/roidapp/photogrid/common/JoinAndroidBeta;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/common/JoinAndroidBeta;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    const v0, 0x7f0d0391

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/common/JoinAndroidBeta;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/common/JoinAndroidBeta;->a:Landroid/widget/TextView;

    .line 38
    iget-object v0, p0, Lcom/roidapp/photogrid/common/JoinAndroidBeta;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/common/JoinAndroidBeta;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/common/JoinAndroidBeta;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/common/JoinAndroidBeta;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/common/JoinAndroidBeta;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/common/JoinAndroidBeta;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    :cond_0
    return-void

    .line 30
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 31
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/common/JoinAndroidBeta;->v:Z

    .line 32
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto :goto_0
.end method

.method public final x()V
    .locals 0

    .prologue
    .line 48
    return-void
.end method
