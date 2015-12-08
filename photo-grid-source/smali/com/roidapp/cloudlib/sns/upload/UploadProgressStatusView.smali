.class public Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/view/View;

.field private c:Landroid/widget/RelativeLayout;

.field private d:Landroid/widget/RelativeLayout;

.field private e:Landroid/widget/RelativeLayout;

.field private f:Landroid/widget/ImageView;

.field private g:Landroid/widget/RelativeLayout;

.field private h:Landroid/widget/RelativeLayout;

.field private i:Landroid/widget/ProgressBar;

.field private j:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 37
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->a(Landroid/content/Context;)V

    .line 38
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 42
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->a(Landroid/content/Context;)V

    .line 43
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 46
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->a:Landroid/content/Context;

    .line 47
    const-string v0, "layout_inflater"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 48
    sget v1, Lcom/roidapp/cloudlib/as;->aj:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->b:Landroid/view/View;

    .line 49
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->b:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->dm:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->c:Landroid/widget/RelativeLayout;

    .line 50
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->b:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->dh:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->d:Landroid/widget/RelativeLayout;

    .line 51
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->b:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->dt:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->e:Landroid/widget/RelativeLayout;

    .line 52
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->b:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->bL:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->f:Landroid/widget/ImageView;

    .line 53
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->b:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->di:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->g:Landroid/widget/RelativeLayout;

    .line 54
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->b:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->dj:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->h:Landroid/widget/RelativeLayout;

    .line 55
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->b:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->dk:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->i:Landroid/widget/ProgressBar;

    .line 56
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->b:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->dl:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->j:Landroid/widget/TextView;

    .line 57
    return-void
.end method

.method public static b()I
    .locals 1

    .prologue
    .line 96
    sget v0, Lcom/roidapp/cloudlib/ar;->di:I

    return v0
.end method

.method public static c()I
    .locals 1

    .prologue
    .line 100
    sget v0, Lcom/roidapp/cloudlib/ar;->dj:I

    return v0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 92
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->d:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 93
    return-void
.end method

.method public final a(I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/16 v1, 0x8

    .line 64
    if-nez p1, :cond_1

    .line 65
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->e:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 66
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 67
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 78
    :cond_0
    :goto_0
    return-void

    .line 68
    :cond_1
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 69
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->e:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 70
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 71
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 72
    :cond_2
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 73
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->e:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 74
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 75
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method public final a(Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 82
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 84
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 60
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->f:Landroid/widget/ImageView;

    invoke-static {v0, p1}, Lcom/roidapp/cloudlib/sns/upload/e;->a(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 61
    return-void
.end method

.method public final b(I)V
    .locals 3

    .prologue
    .line 87
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->i:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 88
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->j:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    return-void
.end method
