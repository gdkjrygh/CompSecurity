.class final Lcom/arist/activity/d;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field final synthetic a:Lcom/arist/activity/c;

.field private final synthetic b:I


# direct methods
.method constructor <init>(Lcom/arist/activity/c;I)V
    .locals 0

    iput-object p1, p0, Lcom/arist/activity/d;->a:Lcom/arist/activity/c;

    iput p2, p0, Lcom/arist/activity/d;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    iget-object v0, p0, Lcom/arist/activity/d;->a:Lcom/arist/activity/c;

    invoke-static {v0}, Lcom/arist/activity/c;->a(Lcom/arist/activity/c;)Lcom/arist/activity/AddToListActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/arist/activity/AddToListActivity;->c(Lcom/arist/activity/AddToListActivity;)[Z

    move-result-object v0

    iget v1, p0, Lcom/arist/activity/d;->b:I

    aput-boolean p2, v0, v1

    iget-object v0, p0, Lcom/arist/activity/d;->a:Lcom/arist/activity/c;

    invoke-static {v0}, Lcom/arist/activity/c;->a(Lcom/arist/activity/c;)Lcom/arist/activity/AddToListActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/arist/activity/AddToListActivity;->d(Lcom/arist/activity/AddToListActivity;)V

    return-void
.end method
